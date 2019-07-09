package ua.goodtime.goodtimemenu.datebase;

import android.content.Context;
import android.database.Cursor;

import java.io.IOException;

public class DatabaseSingleton {

    private static DatabaseSingleton databaseSingleton;

    private DatabaseSingleton() {

    }

    public static synchronized DatabaseSingleton getDatabaseSingleton() {
        if (databaseSingleton == null) {
            databaseSingleton = new DatabaseSingleton();
        }
        return databaseSingleton;
    }

    public String getTest(Context context) throws IOException {
        DatabaseHelper databaseHelper = new DatabaseHelper(context);
        databaseHelper.createDataBase();

        databaseHelper.openDataBase();

        Cursor cursor = databaseHelper.getCursor();

        int nameIndex = cursor.getColumnIndex("name");
        String result = "";

        if (cursor.moveToFirst()) {
            do {
                result = cursor.getString(nameIndex);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return result;
    }
}
