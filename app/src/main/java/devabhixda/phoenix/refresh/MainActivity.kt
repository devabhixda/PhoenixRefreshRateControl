package devabhixda.phoenix.refresh

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import jp.wasabeef.takt.Seat
import jp.wasabeef.takt.Takt
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        set60.setOnClickListener { setRefreshRate(RefreshRate.Sixty) }
        set90.setOnClickListener { setRefreshRate(RefreshRate.Ninety) }
        set120.setOnClickListener { setRefreshRate(RefreshRate.HundredTwenty) }
    }
}