package latihan_1_input;

class AlatTulis {
    private String nama;
    private int stok;
    private int hargaSatuan;
    private int totalHargaPembelian; 

    public AlatTulis(String nama, int stok, int hargaSatuan) {
        this.nama = nama;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
        this.totalHargaPembelian = 0; 
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public int getTotalHargaPembelian() {
        return totalHargaPembelian;  
    }

    public String beli(int jumlah) {
        if (jumlah > stok) {
            return "Stok " + nama + " tidak mencukupi. Tersedia: " + stok + ".";
        }
        stok -= jumlah;
        int totalHarga = jumlah * hargaSatuan;
        totalHargaPembelian += totalHarga;  // Update total harga pembelian
        return "Jumlah Dibeli: " + jumlah +
                ", Total Harga Pembelian: " + totalHarga +
                ", Stok Tersisa: " + stok;
    }

    public String getData() {
        return "Nama: " + nama + ", Stok: " + stok + ", Harga Satuan: " + hargaSatuan + ", Total Harga Pembelian: " + totalHargaPembelian;
    }
}

class TotalHarga {
    private int total;

    public void setTotal(AlatTulis[] alatTulisArray) {
        total = 0;
        for (AlatTulis alatTulis : alatTulisArray) {
            total += alatTulis.getTotalHargaPembelian();  // Menambahkan total harga pembelian
        }
    }

    public int getTotal() {
        return total;
    }
}

