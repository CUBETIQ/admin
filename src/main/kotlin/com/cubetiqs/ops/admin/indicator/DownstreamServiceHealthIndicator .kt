package com.cubetiqs.ops.admin.indicator

import org.springframework.boot.actuate.health.Health
import org.springframework.boot.actuate.health.ReactiveHealthIndicator
import reactor.core.publisher.Mono

@Indicator
class DownstreamServiceHealthIndicator : ReactiveHealthIndicator {
    override fun health(): Mono<Health?>? {
        return checkDownstreamServiceHealth()?.onErrorResume { Mono.just(Health.Builder().down(it).build()) }
    }

    private fun checkDownstreamServiceHealth(): Mono<Health?>? {
        return Mono.just(Health.Builder().up().build())
    }
}