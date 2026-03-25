//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double[] mass = {2, 23, 4,600, 6, 7,78, 9};

    //1 Завдання

//    for (
//            int i = numbers.length - 1;
//            i >= 0; i--) {
//        System.out.println(numbers[i]);
//
//
//    }
//}
    //2 Завдання

//for  (int i=0;i< numbers.length-1;i++) {
//    if (i%2==0){
//        numbers[i]=Math.pow(numbers[i],5);
//    }
//    System.out.println("Element["+i+"]="+numbers[i]);
//}
//}
    //3 Завдання
//     double min=0;
//   for  (int i=0;i< numbers.length;i++) {
//      if(i>numbers[i]){
//            numbers[i]=numbers[i+1];
//        }
//
//
//    }
//    System.out.println(numbers);
    //4 Завдання
    int length = mass.length;

    for(int i=0;i<length;i++){
        for(int j=length-1-i;j>=0;j--) {
            if (mass[j+] <mass[j-1]) {
                int temp = mass[j];
                mass[j] = mass[j + 1];
                mass[j + 1] = temp;

            }
        }


    }

}

