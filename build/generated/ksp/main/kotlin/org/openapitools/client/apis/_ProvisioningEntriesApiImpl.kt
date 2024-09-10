// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.`internal`.KtorfitInterface
import de.jensklingenberg.ktorfit.`internal`.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Int
import kotlin.Long
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.LoanProductProvisioningEntryData
import org.openapitools.client.models.PostProvisioningEntriesRequest
import org.openapitools.client.models.PostProvisioningEntriesResponse
import org.openapitools.client.models.ProvisioningEntryData
import org.openapitools.client.models.PutProvisioningEntriesRequest
import org.openapitools.client.models.PutProvisioningEntriesResponse

@OptIn(InternalKtorfitApi::class)
public class _ProvisioningEntriesApiImpl : ProvisioningEntriesApi, KtorfitInterface {
  override lateinit var _converter: KtorfitConverterHelper

  override suspend
      fun createProvisioningEntries(postProvisioningEntriesRequest: PostProvisioningEntriesRequest?):
      PostProvisioningEntriesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningentries")
        }
        setBody(postProvisioningEntriesRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PostProvisioningEntriesResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PostProvisioningEntriesResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PostProvisioningEntriesResponse,
        org.openapitools.client.models.PostProvisioningEntriesResponse>(_typeData,_ext)!!
  }

  override suspend fun modifyProvisioningEntry(
    entryId: Long,
    command: String?,
    putProvisioningEntriesRequest: PutProvisioningEntriesRequest?,
  ): PutProvisioningEntriesResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningentries/${"$entryId".encodeURLPath()}")
        command?.let{ parameter("command", "$it") }
        }
        setBody(putProvisioningEntriesRequest) 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.PutProvisioningEntriesResponse",
    typeInfo = typeInfo<org.openapitools.client.models.PutProvisioningEntriesResponse>())

    return _converter.suspendRequest<org.openapitools.client.models.PutProvisioningEntriesResponse,
        org.openapitools.client.models.PutProvisioningEntriesResponse>(_typeData,_ext)!!
  }

  override suspend fun retrieveAllProvisioningEntries(offset: Int?, limit: Int?):
      List<ProvisioningEntryData> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningentries")
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename =
        "kotlin.collections.List<org.openapitools.client.models.ProvisioningEntryData>",
    typeInfo =
        typeInfo<kotlin.collections.List<org.openapitools.client.models.ProvisioningEntryData>>())

    return _converter.suspendRequest<kotlin.collections.List<org.openapitools.client.models.ProvisioningEntryData>,
        org.openapitools.client.models.ProvisioningEntryData>(_typeData,_ext)!!
  }

  override suspend fun retrieveProviioningEntries(
    entryId: Long?,
    offset: Int?,
    limit: Int?,
    officeId: Long?,
    productId: Long?,
    categoryId: Long?,
  ): LoanProductProvisioningEntryData {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningentries/entries")
        entryId?.let{ parameter("entryId", "$it") }
        offset?.let{ parameter("offset", "$it") }
        limit?.let{ parameter("limit", "$it") }
        officeId?.let{ parameter("officeId", "$it") }
        productId?.let{ parameter("productId", "$it") }
        categoryId?.let{ parameter("categoryId", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.LoanProductProvisioningEntryData",
    typeInfo = typeInfo<org.openapitools.client.models.LoanProductProvisioningEntryData>())

    return _converter.suspendRequest<org.openapitools.client.models.LoanProductProvisioningEntryData,
        org.openapitools.client.models.LoanProductProvisioningEntryData>(_typeData,_ext)!!
  }

  override suspend fun retrieveProvisioningEntry(entryId: Long): ProvisioningEntryData {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_converter.baseUrl + "v1/provisioningentries/${"$entryId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    qualifiedTypename = "org.openapitools.client.models.ProvisioningEntryData",
    typeInfo = typeInfo<org.openapitools.client.models.ProvisioningEntryData>())

    return _converter.suspendRequest<org.openapitools.client.models.ProvisioningEntryData,
        org.openapitools.client.models.ProvisioningEntryData>(_typeData,_ext)!!
  }
}

public fun Ktorfit.createProvisioningEntriesApi(): ProvisioningEntriesApi =
    this.create(_ProvisioningEntriesApiImpl().apply { _converter=
    KtorfitConverterHelper(this@createProvisioningEntriesApi) })
