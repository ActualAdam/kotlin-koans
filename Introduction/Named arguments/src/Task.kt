fun joinOptions(options: Collection<String>) =
        options.joinToString(
                prefix = "[",
                postfix = "]",
                separator = ", ",
                transform = { it }
        )


