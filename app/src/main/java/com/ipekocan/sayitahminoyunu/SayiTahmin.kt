package com.ipekocan.sayitahminoyunu

import java.util.Scanner
import kotlin.random.Random

fun main() {
    var kalanHak = 3

    val randomSayi = Random.nextInt(0, 101)

    println("----SAYI TAHMİN OYUNUNA HOŞGELDİNİZ----")
    print("Aklımdan bir sayı tuttum. Tuttuğum sayıyı tahmin et: ")

    while (kalanHak > 0) {
        val input = Scanner(System.`in`)
        val tahminSayi = input.nextInt()

        kalanHak--

        if (tahminSayi != null) {
            if (tahminSayi > randomSayi) {
                if (kalanHak != 0){
                    println("Daha Küçük Bir Sayı Deneyiniz.")
                    println("Kalan Hakkın: $kalanHak")
                }
            } else if (tahminSayi < randomSayi) {
                if (kalanHak!=0){
                    println("Daha Büyük Bir Sayı Deneyiniz.")
                    println("Kalan Hakkın: $kalanHak")
                }
            } else {
                if (kalanHak!= 0){
                    println("Tebrikler, Bildiniz!!!")
                }
                break
            }


            if (kalanHak > 0) {
                print("Lütfen bir sayı giriniz: ")
            } else {
                println("Tahmin hakkın bitti... Tuttuğum sayı : $randomSayi")
            }

        } else {
            kalanHak--
            if (kalanHak > 0) {
                println("Kalan Hakkın: $kalanHak")
                print("Lütfen bir sayı giriniz: ")
            } else {
                println("Tahmin hakkın bitti... Tuttuğum sayı : $randomSayi")
            }
        }
    }
}
