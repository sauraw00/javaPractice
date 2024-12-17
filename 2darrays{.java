import java.util.Scanner;

class arrays {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

int raws = sc.nextInt();
int cols = sc.nextInt();

int [][] numbers = new int[raws][cols];

//input
for(int i=0; i<raws; i++) {
    for(int j=0;j<cols; j++){
       numbers[i] [j] = sc.nextInt();
    }

}
 
int x =sc.nextInt();
//output
for(int i=0; i<raws;i++){
   for(int j=0; j<cols ; j++){
  // campare with x
  if(numbers [i][j] == x) { 
    System.out.println("x found ata locations (" + i + " , " + j + ")");
  }
    
}
}
}
}