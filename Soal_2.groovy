def scanner = new Scanner(System.in)

print("Masukkan jumlah barang yang akan ditambahkan: ")
def totInput = scanner.nextInt()


for(int i=1; i<totInput; i++){
    print("Masukkan ID barang ke-$i: ")
    def id = scanner.nextLine()
    // store.id = console.readLine('Masukkan ID Barang ke-${i}: ')
    print("Masukkan nama barang: ")
    def name = scanner.nextLine()
    print("Masukkan harga barang: ")
    try{
        def price = scanner.nextInt()
    }
    catch(InputMismatchException e){
        // println("404 Error")
        println("Error: Masukkan harga harus berupa angka.")
    }
    print("Masukkan stok barang: ")
    try{
        def stock = scanner.nextInt()
    }
    catch(InputMismatchException e){
        // println("404 Error")
        println("Error: Masukkan stok harus berupa angka.")
    }
}
