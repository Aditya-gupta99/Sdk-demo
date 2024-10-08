// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
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
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import org.openapitools.client.models.GetAccountsLinkedToPocketResponse
import org.openapitools.client.models.PostLinkDelinkAccountsToFromPocketResponse

@OptIn(InternalKtorfitApi::class)
public class _PocketApiImpl(
  private val _ktorfit: Ktorfit,
) : PocketApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun handleCommands8(command: String?, body: String?):
      PostLinkDelinkAccountsToFromPocketResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/pockets")
        command?.let{ parameter("command", "$it") }
        }
        setBody(body) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PostLinkDelinkAccountsToFromPocketResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun retrieveAll37(): GetAccountsLinkedToPocketResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/self/pockets")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<GetAccountsLinkedToPocketResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _PocketApiProvider : ClassProvider<PocketApi> {
  override fun create(_ktorfit: Ktorfit): PocketApi = _PocketApiImpl(_ktorfit)
}

public fun Ktorfit.createPocketApi(): PocketApi = _PocketApiImpl(this)
