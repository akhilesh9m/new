public class Stack { 
 int capacity;
  int top = -1;
  int arr[];
public Stack(int a)
{
    capacity=a;
   arr= new int[capacity];
    
}
 
  
  
  
 public int push(int pushedElement) {  
  if (top < capacity - 1) {  
   top++;  
   arr[top] = pushedElement;  
   return 1;    
  } else {  
   return -1;  
  }  
 }  
  
 public int pop() {  
  if (top >= 0) {  
      int element=arr[top];
   top--;  
     return element;
  } else {  
   return -1;  
  }  
 }  
  
 public String printElements() {  
     String str="";
  if (top >= 0) {  
   System.out.println("Elements in stack :");  
   for (int i = top; i >= 0; i--) {  
    str=str.concat(arr[i]+"");  
   }  
   return str;
  } 
  else
      return (-1+"");
 }  
  public static void main(String args[])
  {
  }
  }
  
