package com.example.testprogressbar;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RatingBar;

public class MainActivity extends Activity {
	private RatingBar mRatingBar;
	private LinearLayout layout;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		layout = (LinearLayout) findViewById(R.id.layout);
		// int[] colors =new
		// int[]{Color.YELLOW,Color.RED,Color.BLUE,Color.GREEN};
		// int[] shade_colors = new int[]{Color.rgb(180, 180, 0),Color.rgb(180,
		// 20, 10),Color.rgb(3, 23, 163),Color.rgb(15, 165, 0)};
		int[] colors = new int[] { Color.RED, 0xadadad, Color.BLUE,
				Color.GREEN };
		int[] shade_colors = new int[] { Color.rgb(173, 173, 173),
				Color.rgb(44, 155, 124), Color.rgb(3, 23, 163),
				Color.rgb(15, 165, 0) };

		for (int i = 0; i < colors.length; i++) {
			Log.i("cat", "colors=" + colors[i] + ";;;shade_colors="
					+ shade_colors[i]);

		}

		// int[] percent = new int[]{90,270};
		// int[] percent = new int[]{(int) ((40.97/100)*360),(int)
		// ((59.03/100)*360)};
		int i = (int) ((59.03 / 100) * 360);
		int j = 360 - i;
		int[] percent = new int[] { j, i };
		System.out.println(percent[0]);
		System.out.println(percent[1]);
		PieView pieView = new PieView(this, colors, shade_colors, percent);

		layout.addView(pieView, new LayoutParams(300, 300));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
