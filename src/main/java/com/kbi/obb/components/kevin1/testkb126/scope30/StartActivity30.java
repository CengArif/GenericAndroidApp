package com.kbi.obb.components.kevin1.testkb126.scope30;

import android.content.Intent;
import android.content.Context;
public class StartActivity30 {
public Context context;
public Intent intent;
public void call() {
Intent i = new Intent(context, activity1.class);
if(intent != null) {
i.fillIn(intent, 0);
}
context.startActivity(i);
}
}