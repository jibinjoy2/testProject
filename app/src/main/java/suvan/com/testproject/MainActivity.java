package suvan.com.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    Set<String> stringSet;
    List<String> stringList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringList = new ArrayList<>();

        stringList.add("jinson");
        stringList.add("jinson");
        stringList.add("vishnu");
        stringList.add("jibin");
        stringList.add("jibin");
        stringList.add("jibin");

        stringList.add("zxy");
        stringList.add("bbb");
        stringList.add("bbbc");
        stringList.add("ccc");

        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();

        stringSet = new LinkedHashSet<>(stringList);
        stringList.clear();
        stringList.addAll(stringSet);

        Log.d("ads","");
    }
}
