package com.kbi.obb.components.kevin1.testkb126.scope30;

import com.kbi.obb2.corelib.variable.StringVariable;
import com.kbi.obb2.corelib.ActivityScope;
import com.kbi.obb2.corelib.logic.StringConcat;
import com.kbi.obb2.corelib.SMSComponent;
import com.kbi.obb.components.kevin1.testkb126.R;

public class activity1 extends com.kbi.obb2.corelib.ActivityScope {
public void started() {
}
public com.kbi.obb2.corelib.SMSComponent sMS1 = new com.kbi.obb2.corelib.SMSComponent(this.serviceLocator){
public void smsReceived() {
StringConcat stringConcat1 = new StringConcat();
stringConcat1.input1 = this.phoneNumberOut;
stringConcat1.input2 = this.messageOut;
stringConcat1.call();
inputPhoneNumber1.get();
sMS1.message = stringConcat1.output1;
sMS1.number = inputPhoneNumber1.output;
sMS1.sendText();
}
};
{
}

public com.kbi.obb2.corelib.variable.StringVariable inputPhoneNumber1 = new com.kbi.obb2.corelib.variable.StringVariable(this.serviceLocator){
};
{
inputPhoneNumber1.string = "2024311173";
}

public void _init() {
setContentView(R.layout.activity1);
}

}