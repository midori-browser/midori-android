package org.midori_browser.midori

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class ActivityTabs : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)
        setSupportActionBar(findViewById(R.id.toolbar2))

        var actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_2, menu)
        return super.onCreateOptionsMenu(menu)
    }
}