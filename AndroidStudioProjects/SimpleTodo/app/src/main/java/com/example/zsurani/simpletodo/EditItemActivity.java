package com.example.zsurani.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    int position;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String item_to_fix = getIntent().getStringExtra("item_to_edit");
        position = getIntent().getIntExtra("position", 0);
        EditText etName = (EditText) findViewById(R.id.textView2);
        etName.append("");
        etName.append(item_to_fix);
    }

    public void onSubmit(View v) {
        EditText etName = (EditText) findViewById(R.id.textView2);
        Intent data = new Intent();
        data.putExtra("fixed_text", etName.getText().toString());
        data.putExtra("position_to_change", position);
        setResult(RESULT_OK, data);
        finish();
    }
}
