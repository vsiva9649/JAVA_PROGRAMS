package Applets_Try;

import java.awt.*;
import java.applet.Applet;
/*<applet code ="LabelExample" width=300 height=300></applet>*/
@SuppressWarnings({ "serial", "removal" })
public class LabelExample extends Applet{  
  
public void init(){  
	add(new Label("First Name"));
	add(new Label("Last Name",Label.RIGHT));

}  
  
}  
