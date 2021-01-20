package com.myapp.uas.data

object userDummy {
    val list: ArrayList<user>
    get() {
        val list = arrayListOf<user>()

        list.add(user(
            "sidiqpermana",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            1000,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            100,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(user(
            "sidiqpermana2",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            1000,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            100,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(user(
            "sidiqpermana3",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            1000,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            100,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(user(
            "sidiqpermana4",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            1000,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            100,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(user(
            "sidiqpermana5",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            1000,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            100,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))
        return list
    }
}