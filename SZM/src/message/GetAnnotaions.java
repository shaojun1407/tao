package message;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Annotation;
import java.lang.reflect.Method;
import lombok.ToString;

public class GetAnnotaions {

	public static void main(String[] args) throws Exception{
		Class<?>cls=Class.forName("Info");
		java.lang.reflect.Method toStrinMethod =cls.getMethod("toString");
		//取得全部的Annotation
		java.lang.annotation.Annotation[] ans=toStrinMethod.getAnnotations();
		for(int i=0;i<ans.length;++i) {
			System.out.println(ans[i]);
		}
		
		

	}

}
