package com.example.learnandroid;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;

import java.util.Objects;

public class sqLite_Database_Activity extends AppCompatActivity {
    private String unityGameID = "5167775";
    private String Banner_ID = "banner_source";
    private Boolean testMode = false;

    private EditText editTextID;
    private EditText editTextName;
    private EditText editTextNum;

    private String name;
    private int number;
    private String ID;

    private dbHelper db;

    FloatingActionButton show_code_button;
    String Javacode = "public class MainActivity extends AppCompatActivity {\n" +
            "\n" +
            "\n" +
            "    private EditText editTextID;\n" +
            "    private EditText editTextName;\n" +
            "    private EditText editTextNum;\n" +
            "\n" +
            "    private String name;\n" +
            "    private int number;\n" +
            "    private String ID;\n" +
            "\n" +
            "    private dbHelper db;\n" +
            "\n" +
            "\n" +
            "    @Override\n" +
            "    protected void onCreate(Bundle savedInstanceState) {\n" +
            "        super.onCreate(savedInstanceState);\n" +
            "        setContentView(R.layout.activity_main);\n" +
            "\n" +
            "        db = new dbHelper(this);\n" +
            "\n" +
            "        editTextID = findViewById(R.id.editText1);\n" +
            "        editTextName = findViewById(R.id.editText2);\n" +
            "        editTextNum = findViewById(R.id.editText3);\n" +
            "\n" +
            "        Button buttonSave = findViewById(R.id.button);\n" +
            "        Button buttonRead = findViewById(R.id.button2);\n" +
            "        Button buttonUpdate = findViewById(R.id.button3);\n" +
            "        Button buttonDelete = findViewById(R.id.button4);\n" +
            "        Button buttonSearch = findViewById(R.id.button5);\n" +
            "        Button buttonDeleteAll = findViewById(R.id.button6);\n" +
            "\n" +
            "        buttonSave.setOnClickListener(new \n        View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                name = editTextName.getText().toString();\n" +
            "\n" +
            "\n" +
            "                String num = editTextNum.getText().toString();\n" +
            "\n" +
            "                if (name.isEmpty() || num.isEmpty()) {\n" +
            "\n" +
            "                    Toast.makeText(MainActivity.this, \"Cannot\n                    Submit Empty Fields\", Toast.LENGTH_SHORT).show();\n" +
            "                } else {\n" +
            "                    number = Integer.parseInt(num);\n" +
            "\n" +
            "\n" +
            "                    try {\n" +
            "                        // Insert Data\n" +
            "                        db.insertData(name, number);\n" +
            "\n" +
            "                        // Clear the fields\n" +
            "                        editTextID.getText().clear();\n" +
            "                        editTextName.getText().clear();\n" +
            "                        editTextNum.getText().clear();\n" +
            "\n" +
            "                    } catch (Exception e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "                }\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        buttonRead.setOnClickListener(new \n        View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                final ArrayAdapter<String> adapter =\n         new ArrayAdapter<>(MainActivity.this,\n        android.R.layout.simple_list_item_1);\n" +
            "                String name;\n" +
            "                String num;\n" +
            "                String id;\n" +
            "\n" +
            "                try {\n" +
            "\n" +
            "                    Cursor cursor = db.readData();\n" +
            "                    if (cursor != null && cursor.getCount() > 0) {\n" +
            "\n" +
            "                        while (cursor.moveToNext()) {\n" +
            "\n" +
            "                            id = cursor.getString(0); \n" +
            "                            name = cursor.getString(1);\n" +
            "                            num = cursor.getString(2);\n" +
            "\n" +
            "                            // Add SQLite data to listView\n" +
            "                            adapter.add(\"ID :- \" + id + \"\\n\" +\n" +
            "                                    \"Name :- \" + name + \"\\n\" +\n" +
            "                                    \"Number :- \" + num + \"\\n\\n\");\n" +
            "\n" +
            "\n" +
            "                        }\n" +
            "\n" +
            "\n" +
            "                    } else {\n" +
            "\n" +
            "                        adapter.add(\"No Data\");\n" +
            "                    }\n" +
            "                    cursor.close();\n" +
            "\n" +
            "\n" +
            "                } catch (Exception e) {\n" +
            "                    e.printStackTrace();\n" +
            "                }\n" +
            "\n" +
            "\n" +
            "                // show the saved data in alertDialog\n" +
            "                AlertDialog.Builder builder = new \n              AlertDialog.Builder(MainActivity.this);\n" +
            "                builder.setTitle(\"SQLite saved data\");\n" +
            "                builder.setIcon(R.mipmap.app_icon_foreground);" +
            "                builder.setAdapter(adapter, \n              new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int          which) {\n" +
            "\n" +
            "                    }\n" +
            "                });\n" +
            "\n" +
            "                builder.setPositiveButton(\"OK\", new         DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int        which) {\n" +
            "\n" +
            "                        dialog.cancel();\n" +
            "                    }\n" +
            "                });\n" +
            "\n" +
            "                AlertDialog dialog = builder.create();\n" +
            "                dialog.show();\n" +
            "\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        buttonUpdate.setOnClickListener(new          View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                name = editTextName.getText().toString();\n" +
            "\n" +
            "                String num = editTextNum.getText().toString();\n" +
            "                ID = editTextID.getText().toString();\n" +
            "\n" +
            "                if (name.isEmpty() || num.isEmpty() ||\n          ID.isEmpty()) {\n" +
            "\n" +
            "                    Toast.makeText(MainActivity.this, \"Cannot           Submit Empty Fields\", Toast.LENGTH_SHORT).show();\n" +
            "                } else {\n" +
            "                    number = Integer.parseInt(num);\n" +
            "\n" +
            "\n" +
            "                    try {\n" +
            "                        // Update Data\n" +
            "                        db.updateData(ID, name, number);\n" +
            "\n" +
            "                        // Clear the fields\n" +
            "                        editTextID.getText().clear();\n" +
            "                        editTextName.getText().clear();\n" +
            "                        editTextNum.getText().clear();\n" +
            "\n" +
            "                    } catch (Exception e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "                }\n" +
            "\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        buttonDelete.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                ID = editTextID.getText().toString();\n" +
            "\n" +
            "                if (ID.isEmpty()) {\n" +
            "\n" +
            "                    Toast.makeText(MainActivity.this, \"Please enter the ID\", Toast.LENGTH_SHORT).show();\n" +
            "                } else {\n" +
            "\n" +
            "\n" +
            "                    try {\n" +
            "                        // Delete Data\n" +
            "                        db.deleteData(ID);\n" +
            "\n" +
            "                        // Clear the fields\n" +
            "                        editTextID.getText().clear();\n" +
            "                        editTextName.getText().clear();\n" +
            "                        editTextNum.getText().clear();\n" +
            "\n" +
            "                    } catch (Exception e) {\n" +
            "                        e.printStackTrace();\n" +
            "                    }\n" +
            "                }\n" +
            "\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        buttonDeleteAll.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                // Delete all data\n" +
            "                // You can simply delete all the data by calling this method --> db.deleteAllData();\n" +
            "                // You can try this also\n" +
            "                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);\n" +
            "                builder.setIcon(R.mipmap.app_icon_foreground);\n" +
            "                builder.setTitle(\"Delete All Data\");\n" +
            "                builder.setCancelable(false);\n" +
            "                builder.setMessage(\"Do you really need to delete your all data ?\");\n" +
            "                builder.setPositiveButton(\"Yes\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int which) {\n" +
            "\n" +
            "                        // User confirmed , now you can delete the data\n" +
            "                        db.deleteAllData();\n" +
            "\n" +
            "                        // Clear the fields\n" +
            "                        editTextID.getText().clear();\n" +
            "                        editTextName.getText().clear();\n" +
            "                        editTextNum.getText().clear();\n" +
            "                    }\n" +
            "                });\n" +
            "                builder.setNegativeButton(\"No\", new DialogInterface.OnClickListener() {\n" +
            "                    @Override\n" +
            "                    public void onClick(DialogInterface dialog, int which) {\n" +
            "\n" +
            "                        // user not confirmed\n" +
            "                        dialog.cancel();\n" +
            "                    }\n" +
            "                });\n" +
            "\n" +
            "                AlertDialog dialog = builder.create();\n" +
            "                dialog.show();\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "\n" +
            "        buttonSearch.setOnClickListener(new View.OnClickListener() {\n" +
            "            @Override\n" +
            "            public void onClick(View v) {\n" +
            "\n" +
            "                ID = editTextID.getText().toString();\n" +
            "\n" +
            "                if (ID.isEmpty()) {\n" +
            "\n" +
            "                    Toast.makeText(MainActivity.this, \"Please enter the ID\", Toast.LENGTH_SHORT).show();\n" +
            "                } else {\n" +
            "\n" +
            "\n" +
            "                    try {\n" +
            "                        // Search data\n" +
            "                        Cursor cursor = db.searchData(ID);\n" +
            "                        if (cursor.moveToFirst()) {\n" +
            "\n" +
            "                            editTextName.setText(cursor.getString(1));\n" +
            "                            editTextNum.setText(cursor.getString(2));\n" +
            "                            Toast.makeText(MainActivity.this, \"Data successfully searched\", Toast.LENGTH_SHORT).show();\n" +
            "\n" +
            "                        } else {\n" +
            "                            Toast.makeText(MainActivity.this, \"ID not found\", Toast.LENGTH_SHORT).show();\n" +
            "\n" +
            "                            editTextNum.setText(\"ID Not found\");\n" +
            "                            editTextName.setText(\"ID not found\");\n" +
            "\n" +
            "                        }\n" +
            "\n" +
            "\n" +
            "                        cursor.close();\n" +
            "\n" +
            "\n" +
            "                    } catch (Exception e) {\n" +
            "                        e.printStackTrace();\n" +
            "\n" +
            "                    }\n" +
            "                }\n" +
            "\n" +
            "            }\n" +
            "        });\n" +
            "    }\n" +
            "}";

    String xmlcode = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
            "<ScrollView xmlns:android=\"http://schemas.android.com/apk/res/android\"\n" +
            "    xmlns:app=\"http://schemas.android.com/apk/res   -auto\"\n" +
            "    xmlns:tools=\"http://schemas.android.com/tools\"\n" +
            "    android:layout_width=\"match_parent\"\n" +
            "    android:layout_height=\"match_parent\"\n" +
            "    tools:context=\".MainActivity\">\n" +
            "\n" +
            "\n" +
            "    <androidx.constraintlayout.widget.ConstraintLayout\n" +
            "        android:layout_width=\"match_parent\"\n" +
            "        android:layout_height=\"match_parent\">\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/editText2\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginStart=\"32dp\"\n" +
            "            android:layout_marginEnd=\"32dp\"\n" +
            "            android:layout_marginBottom=\"24dp\"\n" +
            "            android:gravity=\"start|top\"\n" +
            "            android:hint=\"Enter example Name\"\n" +
            "            android:inputType=\"textMultiLine\"\n" +
            "            app:layout_constraintBottom_toTopOf=\"@+id/\n            editText3\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"parent\"\n" +
            "            app:layout_constraintStart_toStartOf=\"parent\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/editText3\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:maxLength=\"10\"\n" +
            "            android:hint=\"Enter example  number\"\n" +
            "            android:inputType=\"number\"" +
            "            app:layout_constraintBottom_toBottomOf=\"parent\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"@+id\n            /editText2\"\n" +
            "            app:layout_constraintStart_toStartOf=\"@+id\n            /editText2\"\n" +
            "            app:layout_constraintTop_toTopOf=\"parent\"\n" +
            "            app:layout_constraintVertical_bias=\"0.38\" />\n" +
            "\n" +
            "        <EditText\n" +
            "            android:id=\"@+id/editText1\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginBottom=\"24dp\"\n" +
            "            android:hint=\"Enter id For update delete and \n            search\"\n" +
            "            android:inputType=\"numberSigned\"\n" +
            "            app:layout_constraintBottom_toTopOf=\"@+id\n            /editText2\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"@+id\n            /editText2\"\n" +
            "            app:layout_constraintStart_toStartOf=\"@+id\n            /editText2\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginTop=\"32dp\"\n" +
            "            android:layout_marginEnd=\"8dp\"\n" +
            "            android:background=\"@drawable/custom_button\"\n" +
            "            android:text=\"Save\"\n" +
            "            app:layout_constraintEnd_toStartOf=\"@+id\n            /button2\"\n" +
            "            app:layout_constraintStart_toStartOf=\"@+id\n            /editText3\"\n" +
            "            app:layout_constraintTop_toBottomOf=\"@+id\n            /editText3\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button3\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"48dp\"\n" +
            "            android:layout_marginTop=\"16dp\"\n" +
            "            android:layout_marginEnd=\"8dp\"\n" +
            "            android:background=\"@drawable/custom_button\"\n" +
            "            android:text=\"Update\"\n" +
            "            app:layout_constraintEnd_toStartOf=\"@+id\n            /button4\"\n" +
            "            app:layout_constraintStart_toStartOf=\"@+id\n            /editText3\"\n" +
            "            app:layout_constraintTop_toBottomOf=\"@+id\n            /button\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button2\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginStart=\"8dp\"\n" +
            "            android:layout_marginTop=\"32dp\"\n" +
            "            android:background=\"@drawable/custom_button\"\n" +
            "            android:text=\"Read\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"@+id\n            /editText3\"\n" +
            "            app:layout_constraintStart_toEndOf=\"@+id\n            /button\"\n" +
            "            app:layout_constraintTop_toBottomOf=\"@+id\n            /editText3\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button4\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginStart=\"8dp\"\n" +
            "            android:layout_marginTop=\"16dp\"\n" +
            "            android:background=\"@drawable/custom_button\"\n" +
            "            android:text=\"Delete\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"@+id\n            /editText3\"\n" +
            "            app:layout_constraintStart_toEndOf=\"@+id\n            /button3\"\n" +
            "            app:layout_constraintTop_toBottomOf=\"@+id\n            /button2\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button5\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginTop=\"16dp\"\n" +
            "            android:background=\"@drawable/custom_button\"\n" +
            "            android:text=\"Search\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"@+id\n            /editText3\"\n" +
            "            app:layout_constraintStart_toStartOf=\"@+id\n            /button3\"\n" +
            "            app:layout_constraintTop_toBottomOf=\"@+id\n            /button3\" />\n" +
            "\n" +
            "        <Button\n" +
            "            android:id=\"@+id/button6\"\n" +
            "            android:layout_width=\"0dp\"\n" +
            "            android:layout_height=\"wrap_content\"\n" +
            "            android:layout_marginTop=\"16dp\"\n" +
            "            android:background=\"@drawable/custom_button\"\n" +
            "            android:text=\"Delete All Data\"\n" +
            "            app:layout_constraintEnd_toEndOf=\"@+id\n            /editText3\"\n" +
            "            app:layout_constraintStart_toStartOf=\"@+id\n            /button3\"\n" +
            "            app:layout_constraintTop_toBottomOf=\"@+id\n            /button5\" />\n" +
            "\n" +
            "    </androidx.constraintlayout.widget.ConstraintLayout>\n" +
            "\n" +
            "\n" +
            "</ScrollView>";
    String other = "public class dbHelper extends SQLiteOpenHelper {\n" +
            "\n" +
            "    public static final int DATABASE_VERSION = 1;\n" +
            "    public static final String DATABASE_NAME = \"example.db\";\n" +
            "\n" +
            "    public static final String TABLE_NAME = \"Example_table\";\n" +
            "    public static final String COLUMN_ID = \"ID\";\n" +
            "    public static final String COLUMN_NAME = \"NAME\";\n" +
            "    public static final String COLUMN_NUMBER = \"NUMBER\";\n" +
            "\n" +
            "\n" +
            "    Context context;\n" +
            "\n" +
            "    public dbHelper(Context context) {\n" +
            "        super(context, DATABASE_NAME, null, DATABASE_VERSION);\n" +
            "        this.context = context;\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onCreate(SQLiteDatabase db) {\n" +
            "\n" +
            "        String SQL_CREATE = \"CREATE TABLE \" + TABLE_NAME +\n" +
            "                \" (\" + COLUMN_ID + \" INTEGER PRIMARY KEY AUTOINCREMENT, \" +\n" +
            "                COLUMN_NAME + \" TEXT, \" +\n" +
            "                COLUMN_NUMBER + \" INTERGER );\";\n" +
            "\n" +
            "        db.execSQL(SQL_CREATE);\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {\n" +
            "\n" +
            "        String SQL_DELETE = \"DROP TABLE IF EXISTS \" + TABLE_NAME;\n" +
            "\n" +
            "        db.execSQL(SQL_DELETE);\n" +
            "        onCreate(db);\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    public void insertData(String name, int num) {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "        ContentValues values = new ContentValues();\n" +
            "\n" +
            "        values.put(COLUMN_NAME, name);\n" +
            "        values.put(COLUMN_NUMBER, num);\n" +
            "\n" +
            "        // Insert new row\n" +
            "        // Insert SQL Statement\n" +
            "        long result = db.insert(TABLE_NAME, null, values);\n" +
            "\n" +
            "        // To check data is inserted or not\n" +
            "        if (result == -1) {\n" +
            "            Toast.makeText(context, \"Data not saved \", Toast.LENGTH_SHORT).show();\n" +
            "        } else {\n" +
            "            Toast.makeText(context, \"Data saved Successfully\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public void updateData(String id, String name, int num) {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "        ContentValues values = new ContentValues();\n" +
            "        values.put(COLUMN_NAME, name);\n" +
            "        values.put(COLUMN_NUMBER, num);\n" +
            "\n" +
            "        // Which row to update , based on the ID\n" +
            "        // Update SQL Statement\n" +
            "        long result = db.update(TABLE_NAME, values, \"ID = ?\", new String[]{id});\n" +
            "\n" +
            "\n" +
            "        // To check data updated or not\n" +
            "        if (result == -1) {\n" +
            "            Toast.makeText(context, \"Data not Updated\", Toast.LENGTH_SHORT).show();\n" +
            "        } else {\n" +
            "            Toast.makeText(context, \"Data Updated Successfully!\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    void deleteData(String id) {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "\n" +
            "        // SQL Statement for Delete\n" +
            "        long result = db.delete(TABLE_NAME, \"ID = ?\", new String[]{id});\n" +
            "\n" +
            "        if (result == -1) {\n" +
            "            Toast.makeText(context, \"Data not Deleted\", Toast.LENGTH_SHORT).show();\n" +
            "        } else {\n" +
            "            Toast.makeText(context, \"Data Successfully Deleted\", Toast.LENGTH_SHORT).show();\n" +
            "        }\n" +
            "    }\n" +
            "\n" +
            "    public Cursor readData() {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "\n" +
            "        // SQL Statement\n" +
            "        String query = \"SELECT * FROM \" + TABLE_NAME;\n" +
            "\n" +
            "        Cursor cursor = db.rawQuery(query, null);\n" +
            "        return cursor;\n" +
            "\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    public Cursor searchData(String id) {\n" +
            "\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "\n" +
            "\n" +
            "        // Which row to search , based on the ID\n" +
            "        String[] columns = new String[]{COLUMN_ID, COLUMN_NAME, COLUMN_NUMBER};\n" +
            "        Cursor cursor = db.query(TABLE_NAME, columns, \"ID = ?\", new String[]{id},\n" +
            "                null, null, null, null);\n" +
            "\n" +
            "        return cursor;\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    public void deleteAllData() {\n" +
            "        SQLiteDatabase db = this.getWritableDatabase();\n" +
            "        db.execSQL(\"DELETE FROM \" + TABLE_NAME);\n" +
            "    }\n" +
            "\n" +
            "}";
    String other_heading = "DatabaseHelper.java";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sq_lite_database);


        LinearLayout banner = findViewById(R.id.banner_container);
        BannerView view = new BannerView(this, Banner_ID, UnityBannerSize.getDynamicSize(getApplicationContext()));
        view.load();
        banner.addView(view);

        show_code_button = findViewById(R.id.code_button);

        show_code_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inte = new Intent(sqLite_Database_Activity.this, source_CODE_Activity.class);
                inte.putExtra("javacode", Javacode);
                inte.putExtra("xmlcode", xmlcode);
                inte.putExtra("other", other);
                inte.putExtra("other_heading", other_heading);
                startActivity(inte);
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set Title
        Objects.requireNonNull(getSupportActionBar()).setTitle("SQLite Database");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        db = new dbHelper(this);

        editTextID = findViewById(R.id.editText1);
        editTextName = findViewById(R.id.editText2);
        editTextNum = findViewById(R.id.editText3);

        Button buttonSave = findViewById(R.id.button);
        Button buttonRead = findViewById(R.id.button2);
        Button buttonUpdate = findViewById(R.id.button3);
        Button buttonDelete = findViewById(R.id.button4);
        Button buttonSearch = findViewById(R.id.button5);
        Button buttonDeleteAll = findViewById(R.id.button6);


        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = editTextName.getText().toString();


                String num = editTextNum.getText().toString();

                if (name.isEmpty() || num.isEmpty()) {

                    Toast.makeText(sqLite_Database_Activity.this, "Cannot Submit Empty Fields", Toast.LENGTH_SHORT).show();
                } else {
                    number = Integer.parseInt(num);


                    try {
                        // Insert Data
                        db.insertData(name, number);

                        // Clear the fields
                        editTextID.getText().clear();
                        editTextName.getText().clear();
                        editTextNum.getText().clear();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        buttonRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final ArrayAdapter<String> adapter = new ArrayAdapter<>(sqLite_Database_Activity.this, android.R.layout.simple_list_item_1);
                String name;
                String num;
                String id;

                try {

                    Cursor cursor = db.readData();
                    if (cursor != null && cursor.getCount() > 0) {

                        while (cursor.moveToNext()) {

                            id = cursor.getString(0); // get data in column index 0
                            name = cursor.getString(1); // get data in column index 1
                            num = cursor.getString(2); // get data in column index 2

                            // Add SQLite data to listView
                            adapter.add("ID :- " + id + "\n" +
                                    "Name :- " + name + "\n" +
                                    "Number :- " + num + "\n\n");


                        }


                    } else {

                        adapter.add("No Data");
                    }
                    cursor.close();


                } catch (Exception e) {
                    e.printStackTrace();
                }


                // show the saved data in alertDialog
                AlertDialog.Builder builder = new AlertDialog.Builder(sqLite_Database_Activity.this);
                builder.setTitle("SQLite saved data");
                builder.setIcon(R.drawable.datastorage);
                builder.setAdapter(adapter, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.cancel();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();


            }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name = editTextName.getText().toString();

                String num = editTextNum.getText().toString();
                ID = editTextID.getText().toString();

                if (name.isEmpty() || num.isEmpty() || ID.isEmpty()) {

                    Toast.makeText(sqLite_Database_Activity.this, "Cannot Submit Empty Fields", Toast.LENGTH_SHORT).show();
                } else {
                    number = Integer.parseInt(num);


                    try {
                        // Update Data
                        db.updateData(ID, name, number);

                        // Clear the fields
                        editTextID.getText().clear();
                        editTextName.getText().clear();
                        editTextNum.getText().clear();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


            }
        });

        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ID = editTextID.getText().toString();

                if (ID.isEmpty()) {

                    Toast.makeText(sqLite_Database_Activity.this, "Please enter the ID", Toast.LENGTH_SHORT).show();
                } else {


                    try {
                        // Delete Data
                        db.deleteData(ID);

                        // Clear the fields
                        editTextID.getText().clear();
                        editTextName.getText().clear();
                        editTextNum.getText().clear();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }


            }
        });

        buttonDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Delete all data
                // You can simply delete all the data by calling this method --> db.deleteAllData();
                // You can try this also
                AlertDialog.Builder builder = new AlertDialog.Builder(sqLite_Database_Activity.this);
                builder.setIcon(R.drawable.datastorage);
                builder.setTitle("Delete All Data");
                builder.setCancelable(false);
                builder.setMessage("Do you really need to delete your all data ?");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // User confirmed , now you can delete the data
                        db.deleteAllData();

                        // Clear the fields
                        editTextID.getText().clear();
                        editTextName.getText().clear();
                        editTextNum.getText().clear();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // user not confirmed
                        dialog.cancel();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();

            }
        });

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ID = editTextID.getText().toString();

                if (ID.isEmpty()) {

                    Toast.makeText(sqLite_Database_Activity.this, "Please enter the ID", Toast.LENGTH_SHORT).show();
                } else {


                    try {
                        // Search data
                        Cursor cursor = db.searchData(ID);
                        if (cursor.moveToFirst()) {

                            editTextName.setText(cursor.getString(1));
                            editTextNum.setText(cursor.getString(2));
                            Toast.makeText(sqLite_Database_Activity.this, "Data successfully searched", Toast.LENGTH_SHORT).show();

                        } else {
                            Toast.makeText(sqLite_Database_Activity.this, "ID not found", Toast.LENGTH_SHORT).show();

                            editTextNum.setText("ID Not found");
                            editTextName.setText("ID not found");

                        }


                        cursor.close();


                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {


        if (getFragmentManager().getBackStackEntryCount() > 0) {
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();
        }
//        // add event for back button pressed
//        Intent intent = new Intent(this, MainActivity.class);
//        finish();
//        startActivity(intent);
        return true;
    }
}


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//
//
//    }
//}