package android.vietfootball;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {
	private ImageView btnMenu, btnExit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		loadComponent();
	}

	//Load các thành phần
	private void loadComponent() {
		btnMenu = (ImageView) findViewById(R.id.btnMenu);
		btnExit = (ImageView) findViewById(R.id.btnExit);
		
		btnMenu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				processMenu();
			}
		});
		
		btnExit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				processExit();
			}
		});
	}
	
	//Xử lý cho nút Exit
	protected void processExit() {
		finish();
	}

	//Xử lý cho nút Menu
	protected void processMenu() {
		Intent intent = new Intent(this, DanhSachDoiBong.class);
		startActivity(intent);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
