package edu.uci.anujshah.e_news;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void websitePressed(View v)
    {
        String url = "";
        switch (v.getId())
        {
            case R.id.yahoo_news:
                url = "https://www.yahoo.com/news";
                break;
            case R.id.google_news:
                url = "https://news.google.com";
                break;
            case R.id.cnn:
                url = "http://www.cnn.com";
                break;
            case R.id.nbc_news:
                url = "http://www.nbcnews.com";
                break;
            case R.id.bbc:
                url = "http://www.bbc.com/news";
                break;
            case R.id.usa_today:
                url = "http://www.usatoday.com";
                break;
            case R.id.cbs_news:
                url = "http://www.cbsnews.com";
                break;
            case R.id.fox_news:
                url = "http://www.foxnews.com";
                break;
            case R.id.abc_news:
                url = "http://abcnews.go.com";
                break;
            case R.id.ny_times:
                url = "http://www.nytimes.com";
                break;
            case R.id.ny_post:
                url = "http://nypost.com";
                break;
            case R.id.boston_globe:
                url = "https://www.bostonglobe.com";
                break;
            case R.id.chicago_tribune:
                url = "http://www.chicagotribune.com";
                break;
            case R.id.la_times:
                url = "http://www.latimes.com";
                break;
            case R.id.washington_post:
                url = "https://www.washingtonpost.com";
                break;
            default:
                break;
        }
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}
