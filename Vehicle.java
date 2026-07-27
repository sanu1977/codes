/*
 An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A
company manager wants to make the production of both types of vehicle according to the given
data below:
1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per
the given data.
Example :
Input :
200 -> Value of V
540 -> Value of W
Output :
TW =130 FW=70
Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels
Constraints :
2<=W
W%2=0
V<W

*/

class Vehicle
{
  public static void main(String[]args)
      {
        int V=200;
        int W=540;
        int FW=0;
        int TW=0;

       if(2<=W && W%2==0 && V<W)
      {
        TW=(4*V-W)/2;
        System.out.println("Two wheeler:"+TW);

        FW=V-TW;
        System.out.println("Four wheeler:"+FW);     
      }
       else
       {
         System.out.println("Invalid Input");
        }
   }
}