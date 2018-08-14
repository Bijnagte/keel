package com.netflix.spinnaker.keel.model

/**
 * Internal representation of an asset.
 */
data class Asset(
  val id: AssetId,
  val apiVersion: String = "1.0",
  val kind: String,
  val dependsOn: Set<AssetId> = emptySet(),
  val spec: ByteArray
) {
  override fun equals(other: Any?): Boolean {
    if (this === other) return true
    if (javaClass != other?.javaClass) return false

    other as Asset

    if (id != other.id) return false

    return true
  }

  override fun hashCode(): Int = id.hashCode()
}

data class AssetId(
  val value: String
)