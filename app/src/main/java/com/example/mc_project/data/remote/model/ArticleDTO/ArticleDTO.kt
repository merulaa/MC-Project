package com.example.mc_project.data.remote.model.ArticleDTO

data class ArticleDTO(
    val content_urls: ContentUrls,
    val description: String,
    val description_source: String,
    val dir: String,
    val displaytitle: String,
    val extract: String,
    val extract_html: String,
    val lang: String,
    val namespace: Namespace,
    val originalimage: Originalimage,
    val pageid: Int,
    val revision: String,
    val thumbnail: Thumbnail,
    val tid: String,
    val timestamp: String,
    val title: String,
    val titles: Titles,
    val type: String,
    val wikibase_item: String
)