package com.example.disastermanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class EmergencyCall extends AppCompatActivity {

    private static final int REQUEST_CALL = 1;
    private TextView Text1, Text2, Text3, Text4, Text5, Text6, Text7, Text8, Text9, Text10, Text11, Text12, Text13, Text14, Text15, Text16, Text17, Text18, Text19, Text20;
    private Button B1, B2, B3, B4, B5, B6, B7, B8, B9, B10, B11, B12, B13, B14, B15, B16, B17, B18, B19, B20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_call);

        Text1 = findViewById(R.id.text1);
        Text2 = findViewById(R.id.text2);
        Text3 = findViewById(R.id.text3);
        Text4 = findViewById(R.id.text4);
        Text5 = findViewById(R.id.text5);
        Text6 = findViewById(R.id.text6);
        Text7 = findViewById(R.id.text7);
        Text8 = findViewById(R.id.text8);
        Text9 = findViewById(R.id.text9);
        Text10 = findViewById(R.id.text10);
        Text11 = findViewById(R.id.text11);
        Text12 = findViewById(R.id.text12);
        Text13 = findViewById(R.id.text13);
        Text14 = findViewById(R.id.text14);
        Text15 = findViewById(R.id.text15);
        Text16 = findViewById(R.id.text16);
        Text17 = findViewById(R.id.text17);
        Text18 = findViewById(R.id.text18);
        Text19 = findViewById(R.id.text19);
        Text20 = findViewById(R.id.text20);

        B1 = findViewById(R.id.B1);
        B2 = findViewById(R.id.B2);
        B3 = findViewById(R.id.B3);
        B4 = findViewById(R.id.B4);
        B5 = findViewById(R.id.B5);
        B6 = findViewById(R.id.B6);
        B7 = findViewById(R.id.B7);
        B8 = findViewById(R.id.B8);
        B9 = findViewById(R.id.B9);
        B10 = findViewById(R.id.B10);
        B11 = findViewById(R.id.B11);
        B12 = findViewById(R.id.B12);
        B13 = findViewById(R.id.B13);
        B14 = findViewById(R.id.B14);
        B15 = findViewById(R.id.B15);
        B16 = findViewById(R.id.B16);
        B17 = findViewById(R.id.B17);
        B18 = findViewById(R.id.B18);
        B19 = findViewById(R.id.B19);
        B20 = findViewById(R.id.B20);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B1();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B2();
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B3();
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B4();
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B5();
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B6();
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B7();
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B8();
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B9();
            }
        });
        B10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B10();
            }
        });
        B11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B11();
            }
        });
        B12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B12();
            }
        });
        B13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B13();
            }
        });
        B14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B14();
            }
        });
        B15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B15();
            }
        });
        B16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B16();
            }
        });
        B17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B17();
            }
        });
        B18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B18();
            }
        });
        B19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B19();
            }
        });
        B20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                B20();
            }
        });
    }

    private void B1() {
        String number = Text1.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B2() {
        String number = Text2.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B3() {
        String number = Text3.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B4() {
        String number = Text4.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B5() {
        String number = Text5.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B6() {
        String number = Text6.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B7() {
        String number = Text7.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B8() {
        String number = Text8.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B9() {
        String number = Text9.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B10() {
        String number = Text10.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B11() {
        String number = Text11.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B12() {
        String number = Text12.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B13() {
        String number = Text13.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B14() {
        String number = Text14.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B15() {
        String number = Text15.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B16() {
        String number = Text16.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B17() {
        String number = Text17.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B18() {
        String number = Text18.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B19() {
        String number = Text19.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }

    private void B20() {
        String number = Text20.getText().toString();
        if (number.trim().length() > 0) {
            if (ContextCompat.checkSelfPermission(EmergencyCall.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(EmergencyCall.this, new String[]{Manifest.permission.CALL_PHONE}, REQUEST_CALL);
            } else {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == REQUEST_CALL) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                B1();
                B2();
                B3();
                B4();
                B5();
                B6();
                B7();
                B8();
                B9();
                B10();
                B11();
                B12();
                B13();
                B14();
                B15();
                B16();
                B17();
                B18();
                B19();
                B20();


            } else {
                Toast.makeText(this, "permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}