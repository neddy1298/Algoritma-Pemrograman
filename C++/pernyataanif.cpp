#include <stdio.h>
#include <conio.h>
#include <iostream>

using namespace std;

int main()
{
    double tot_beli, potongan = 0, jum_bayar = 0;

    cout << "Total Pembelian ";
    cin >> tot_beli;

    if (tot_beli >= 5000)
    {
        potongan = 0.2 * tot_beli;
    }

    cout << "Besarnya Potongan Rp. " << potongan << endl;
    jum_bayar = tot_beli - potongan;
    cout << "Jumlah yang harus dibayar Rp. " << jum_bayar << endl;

    getch();
}
