package com.agisti.listview;

import java.util.ArrayList;

public class DataMakanan {

    private static String[] makanan={
            "Rendang, Indonesia",
            "Nasi goreng, Indonesia",
                    "Sushi, Jepang",
            "Tom Yam Goong, Thailand",
            "Pad Thai, Thailand",
            "Dim Sum, Hongkong",
            "Ramen, Jepang",
            "Peking Duck, China",
            "Lasagna, Italia",
            "Kebab, Turki",
    };
    private static String[] detail={
            "Makanan asli suku Minang ini dinobatkan ssbagai makanan paling enak di dunia. Rasa rempah-rempah di dagingnya meresap sampai ke dalam karena proses memasaknya yang memakan waktu berjam-jam lamanya. Tak heran kalau makanan ini jadi favorit banyak orang, karena memiliki cita rasa yang mendalam. Paling enak dimakan bersama nasi hangat!",
            "Siapa yang tak suka nasi goreng? Bahkan mantan Presiden Amerika Serikat, Barrack Obama mengakui bahwa panganan ini merupakan salah satu makanan favoritnya.\n" +
                    "\n" +
                    "Kini nasi goreng memiliki banyak varian topping, mulai dari daging sapi, daging kambing, petai, sosis, udang, juga ikan teri. Makin lengkap disantap dengan telur dadar atau telur ceplok, acar, dan kerupuk.",
            "Kuliner khas Jepang ini pun juga sudah tenar di seluruh dunia. Sushi biasanya berisi nasi dan ikan yang dibalut dengan rumput laut Jepang alias nori. Namun sekarang sudah banyak ragam sushi lainnya, seperti dengan daging sapi, daging ayam, telur, atau crabstick. Supaya makin mantap, jangan lupa untuk memakannya bersama wasabi serta manisan jahe ya.",
            "Makanan asal Thailand ini pun juga sudah mendapat tempat di hati penggemarnya. Tom yam goong merupakan panganan berkuah asam pedas dengan isian utama berupa udang dan cumi. Jika Moms suka pedas, makanan ini bisa Moms tambahkan lagi irisan cabai rawit merah. Cocok dinikmati saat cuaca hujan dan dingin!",
            "Pad thai merupakan panganan mie yang memiliki rasa yang khas karena menggunakan air asam jawa, kecap ikan, ebi, bawang, dan potongan jeruk nipis. Isiannya pun beragam, mulai dari telur, tauge, irisan wortel, bawang putih goreng, kacang, serta udang.",
            "Makanan berikutnya adalah dim sum. Kuliner dari negara Hong Kong ini memang sudah populer di dunia. Salah satu varian dim sum yang terkenal adalah hakau yakni potongan udang yang dibungkus kemudian dikukus. Dim sum diolah dengan minyak wijen, sehingga menciptakan rasa dan aroma yang luar biasa.",
            "Ramen biasanya menggunakan mie telur berwarna kuning dengan kuah kaldu bening. Ramen asli akan menggunakan kuah kaldu tulang babi dengan tambahan beberapa bumbu khas Jepang.\n" +
                    "\n" +
                    "Meski terkesan ringan, namun kuah ramen kerap menjadi jiwa dari ramen tersebut. Uniknya adalah, makin kencang suara menyeruput saat makan ramen menandakan bahwa ramen tersebut sangat enak.",
            "Panganan ini diolah dengan sangat hati hati dan rumit sehingga menghasilkan bebek yang sangat lembut dan juicy pada bagian dagingnya, kulitnya yang garing dan sama sekali tidak meninggalkan bau berengus khas bebek. Biasanya bebek peking disajikan bersama pancake seperti bakwan, bawang, dan saus hoisin.",
            "Kuliner dari Italia ini juga menjadi salah satu favorit banyak orang di dunia. Rasanya yang creamy membuatnya juga dicintai oleh anak-anak. Lembaran pasta yang disusun bersama saus marinara kental, bechamel yang creamy, kemudian ditambah keju, lalu dipanggang untuk menciptakan rasa yang diciptakan beragam.",
            "Makanan terakhir datang dari Turki yakni kebab. Kebab memikiki banyak variasi, seperti doner, iskender, shish kebab cho shish dan lain-lain. Salah satu yang terkenal didunia adalah shiah kebab di mana daging diolah dengan cara dipanggang secara perlahan. Makan kebab biasanya ditemani dengan roti khas dan isian, mulai dari saus, sayuran, serta irisan daging.",
    };
    private static String[] foto={
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_9.width-800.jpg",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_5.width-800.jpg",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_7.width-800.jpg",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_1.width-800.png",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_3.width-800.jpg",
            "https://img.okezone.com/content/2017/07/21/298/1741458/serupa-tapi-tak-sama-sudah-tahu-belum-kalau-dimsum-dan-momo-berbeda-yCd3I5gPoQ.jpg",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_6.width-800.jpg",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_4.width-800.jpg",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_2.width-800.jpg",
            "https://cdn-cas.orami.co.id/parenting/images/makanan_terenak_dunia_8.width-800.jpg",


    };
    static ArrayList<Makanan> getListData() {
        ArrayList<Makanan> list = new ArrayList<>();
        for (int position = 0; position < makanan.length; position++) {
            Makanan makan = new Makanan();
            makan.setMakanan(makanan[position]);
            makan.setDetail(detail[position]);
            makan.setFoto(foto[position]);
            list.add(makan);
        }
        return list;
    }
}
