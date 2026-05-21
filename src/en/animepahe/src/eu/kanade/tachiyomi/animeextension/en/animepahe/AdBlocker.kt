package eu.kanade.tachiyomi.animeextension.en.animepahe

import android.webkit.WebResourceResponse
import java.io.ByteArrayInputStream

object AdBlocker {
    private val AD_DOMAINS = hashSetOf(
        "doubleclick.net",
        "google-analytics.com",
        "googlesyndication.com",
        "googleadservices.com",
        "googletagmanager.com",
        "ads.google.com",
        "adservice.google.com",
        "analytics.google.com",
        "zedo.com",
        "adbrite.com",
        "adbureau.net",
        "carbonads.net",
        "cdn.carbonads.com",
        "srv.carbonads.net",
        "adnxs.com",
        "adtechus.com",
        "advertising.com",
        "amazon-adsystem.com",
        "casalemedia.com",
        "openx.net",
        "pubmatic.com",
        "rubiconproject.com",
        "yieldmo.com",
        "adroll.com",
        "outbrain.com",
        "taboola.com",
        "revcontent.com",
        "buysellads.com",
        "adform.net",
        "adzerk.net",
        "quantserve.com",
        "scorecardresearch.com",
        "hotjar.com",
        "crazyegg.com",
        "optimizely.com",
        "kwik.cx/ad",
        "kwik.cx/pop",
        "yandex.ru",
        "mc.yandex.ru",
    )

    fun isAd(url: String): Boolean {
        return AD_DOMAINS.any { url.contains(it) }
    }

    fun createEmptyResource(): WebResourceResponse {
        return WebResourceResponse("text/plain", "utf-8", ByteArrayInputStream("".toByteArray()))
    }
}
