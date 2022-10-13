package com.oreyo.di

import com.oreyo.route.challenge.ChallengeRoute
import com.oreyo.route.menu.MenuRoute
import com.oreyo.route.note.NoteRoute
import com.oreyo.route.user.UserRoute
import com.oreyo.route.voucher.VoucherRoute
import io.ktor.server.locations.*
import org.koin.dsl.module

@KtorExperimentalLocationsAPI
val routeModule = module {
	factory { ChallengeRoute(get()) }
	factory { MenuRoute(get()) }
	factory { NoteRoute(get()) }
	factory { UserRoute(get()) }
	factory { VoucherRoute(get()) }
}