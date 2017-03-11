package com.aimewexample.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.aimewexample.recyclerview.adapters.HerosAdapter;
import com.aimewexample.recyclerview.models.Hero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements HerosAdapter.HeroAdapterItemCallBack{

    private RecyclerView recyclerView;
    private LinearLayoutManager llmHorizontal;
    private LinearLayoutManager llmVertical;
    private GridLayoutManager glm;
    private List<Hero> heroList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciar la recyclerView
        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        //crear los layout manager
        llmHorizontal = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        llmVertical = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        glm = new GridLayoutManager(this, 3);

        recyclerView.setLayoutManager(llmHorizontal);

        heroList = new ArrayList<Hero>();
        heroList.add(new Hero("Batman", "Dinero", "Masculino", R.drawable.batman));
        heroList.add(new Hero("Batman", "Dinero", "Masculino", R.drawable.batman));
        heroList.add(new Hero("Batman", "Dinero", "Masculino", R.drawable.batman));
        heroList.add(new Hero("Batman", "Dinero", "Masculino", R.drawable.batman));
        heroList.add(new Hero("Batman", "Dinero", "Masculino", R.drawable.batman));
        heroList.add(new Hero("Batman", "Dinero", "Masculino", R.drawable.batman));

        HerosAdapter adapter = new HerosAdapter(heroList, this);

        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onHeroItemSelected(Hero hero) {
        Toast.makeText(this, hero.getName(), Toast.LENGTH_SHORT).show();
    }
}
