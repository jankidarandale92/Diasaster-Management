package com.example.disastermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.ListResult;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SafetyTipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_tip);
        TextView txt2;
        txt2=findViewById(R.id.txt2);

        FirebaseApp.initializeApp(this);
//        MaterialToolbar toolbar=findViewById(R.id.safety_toolbar);
//        setSupportActionBar(toolbar);

        RecyclerView recyclerView=findViewById(R.id.recycler);
        FirebaseStorage.getInstance().getReference().child("Videos").listAll().addOnSuccessListener(new OnSuccessListener<ListResult>() {
            @Override
            public void onSuccess(ListResult listResult) {
                ArrayList<SafetyTipVideo> arrayList=new ArrayList<>();
                SafetyTipVideoAdaptor adaptor=new SafetyTipVideoAdaptor(SafetyTipActivity.this,arrayList);
                adaptor.setOnItemClickListener(new SafetyTipVideoAdaptor.OnItemClickListener() {
                    @Override
                    public void onClick(SafetyTipVideo video) {
                        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(video.getUrl()));
                        intent.setDataAndType(Uri.parse(video.getUrl()),"video/*");
                        startActivity(intent);
                    }
                });
                recyclerView.setAdapter(adaptor);
                listResult.getItems().forEach(new Consumer<StorageReference>() {
                    @Override
                    public void accept(StorageReference storageReference) {
                        SafetyTipVideo video = new SafetyTipVideo();
                        video.setTitle(storageReference.getName());
                        storageReference.getDownloadUrl().addOnCompleteListener(new OnCompleteListener<Uri>() {
                            @Override
                            public void onComplete(@NonNull Task<Uri> task) {
                                String url = task.getResult().toString(); // Use the direct URL from getDownloadUrl
                                video.setUrl(url);
                                arrayList.add(video);
                                adaptor.notifyDataSetChanged();
                            }
                        });
                    }
                });


            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(SafetyTipActivity.this, "Failed to retrieve videos", Toast.LENGTH_SHORT).show();
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.travelers.com/resources/weather/emergency-preparedness/disaster-preparedness-tips");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}