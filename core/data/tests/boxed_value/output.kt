/**
 * Generated by typeshare 0.1.0
 */

@file:NoLiveLiterals

package com.agilebits.onepassword

import androidx.compose.runtime.NoLiveLiterals
import kotlinx.serialization.*

/// This is a comment.
@Serializable
sealed class Colors {
	@Serializable
	@SerialName("Red")
	object Red: Colors()
	@Serializable
	@SerialName("Blue")
	object Blue: Colors()
	@Serializable
	@SerialName("Green")
	data class Green(val content: String): Colors()
}
