package sec15.exam01_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		
		Method[] declaredMethods = Service.class.getDeclaredMethods(); //서비스에서 선언된 모든 메서드에 대해서 메서드 배열로 얻어낸다 
		
		
		
		/* 
		 * 메서드에 어노테이션이 적용되어있는지 검사
		 * 
		 */
		
//		for (Method method : declaredMethods) {
//			if (method.isAnnotationPresent(PrintAnnotation.class)) {
//				System.out.println(method.getName() + "에는 적용되어있음");
//			} else {
//				System.out.println(method.getName() + "에는 적용되어있지 않음 ");
//			}
//		}
		
		/* 
		 * 메서드에 적용된 어노테이션의 element 값 얻어내기 
		 * 
		 */
		
//		for (Method method : declaredMethods) {
//			if (method.isAnnotationPresent(PrintAnnotation.class)) {
//				PrintAnnotation printAnnotation
//					= method.getAnnotation(PrintAnnotation.class);
//				
//				System.out.println(printAnnotation.value());
//				System.out.println(printAnnotation.number());
//			} 
//		}
		
		/* 
		 * 메서드에 구분선 출력
		 * 
		 */
		for (Method method : declaredMethods) {
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation
					= method.getAnnotation(PrintAnnotation.class);
				
				//메서드에 이름 출력
				System.out.println("["+ method.getName()+"]");
				
				//구분선 출력 
				for(int i=0;i<printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//메서드 호출 
				
				try {
					method.invoke(new Service());
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				/*Service service = new Service();
				*service.method1(); 
				랑 코드가 똑같음*/
			} 
		}
	}
}
