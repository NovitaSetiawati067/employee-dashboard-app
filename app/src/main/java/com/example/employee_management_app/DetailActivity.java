package com.example.employee_management_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView name = findViewById(R.id.valueName);
        TextView position = findViewById(R.id.valuePosition);
        TextView department = findViewById(R.id.valueDepartment);
        TextView phone = findViewById(R.id.valuePhone);

        Button salaryButton = findViewById(R.id.btnSalary);
        Button attendanceButton = findViewById(R.id.btnAttendance);

        name.setText("Novita Setiawati");
        position.setText("Talent Aquisition");
        department.setText("HR");
        phone.setText("08123456789");

        salaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, SalaryActivity.class);
                startActivity(intent);
            }
        });

        attendanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailActivity.this, AttendanceActivity.class);
                startActivity(intent);
            }
        });
    }
}
