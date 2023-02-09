package com.example.juicewrld.model

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position = (0..22).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "You still hear my name on the radio so I’ll live forever.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Who knew evil girls had the prettiest face?",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "I was put here to lead the lost souls.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Baby, you’re a Picasso piece.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "If I die, I’ma die young.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "You put my heart in a grave.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "I’m a rockstar in his prime.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "I still see your shadows in my room.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Man of the year, still got problems.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Lately I been feelin’ the worst so I gotta dress like the best.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "You’re my sunshine through life’s rainclouds",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "My new girl a Lamborghin’, your girl a Honda Accord.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "“All girls are the same, they’re rotting my brain.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "If the love’s real, you’d feel your soul roar like a lion.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Me no want no drama, not a fighter, a lover.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "“What’s the 27 Club? We ain’t making it past 21.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "I’m really all in love with all your flaws and sins.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "I can see stars when I’m gazing at you.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Harmony when I’m around you.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Her name in my brain.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "Your heart is my safe house.",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = "I’ve made it this far, if I can, then you can too",
                author = "'Juice WRLD'"
            ),
            QuoteModel(
                quote = " Another day, another chance to make it great.",
                author = "'Juice WRLD'"
            ),
        )
    }
}