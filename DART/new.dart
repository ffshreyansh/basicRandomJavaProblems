main() {
  //print("hello world");
  // String name = "Vishal";
  // print(name);
  // List arr = [1, 'g', 'b'];
  // print(arr[2]);

  // var name = 'Rahul';
  // print("This is $name");

  // List
  //Fixed Length List

  var lst = new List.filled(3, 4, growable: true);
  lst[0] = lst[1] = 2;
  lst[2] = 3;
  //  lst[0] = 12;
  //  lst[1] = 13;
  //  lst[2] = 11;
  print(lst);
}
