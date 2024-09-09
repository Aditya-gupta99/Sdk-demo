@file:OptIn(InternalKtorfitApi::class)

package org.openapitools.client.infrastructure

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.internal.InternalKtorfitApi
import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.auth.Auth
import io.ktor.client.plugins.auth.providers.BasicAuthCredentials
import io.ktor.client.plugins.auth.providers.basic
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.http.headers
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.openapitools.client.apis.AccountNumberFormatApi
import org.openapitools.client.apis.AccountTransfersApi
import org.openapitools.client.apis.AccountingClosureApi
import org.openapitools.client.apis.AccountingRulesApi
import org.openapitools.client.apis.AdhocQueryApiApi
import org.openapitools.client.apis.AuditsApi
import org.openapitools.client.apis.AuthenticationHTTPBasicApi
import org.openapitools.client.apis.BatchAPIApi
import org.openapitools.client.apis.BulkImportApi
import org.openapitools.client.apis.BulkLoansApi
import org.openapitools.client.apis.BusinessDateManagementApi
import org.openapitools.client.apis.BusinessStepConfigurationApi
import org.openapitools.client.apis.CacheApi
import org.openapitools.client.apis.CalendarApi
import org.openapitools.client.apis.CashierJournalsApi
import org.openapitools.client.apis.CashiersApi
import org.openapitools.client.apis.CentersApi
import org.openapitools.client.apis.ChargesApi
import org.openapitools.client.apis.ClientApi
import org.openapitools.client.apis.ClientChargesApi
import org.openapitools.client.apis.ClientCollateralManagementApi
import org.openapitools.client.apis.ClientFamilyMemberApi
import org.openapitools.client.apis.ClientIdentifierApi
import org.openapitools.client.apis.ClientSearchV2Api
import org.openapitools.client.apis.ClientTransactionApi
import org.openapitools.client.apis.ClientsAddressApi
import org.openapitools.client.apis.CodeValuesApi
import org.openapitools.client.apis.CodesApi
import org.openapitools.client.apis.CollateralManagementApi
import org.openapitools.client.apis.CollectionSheetApi
import org.openapitools.client.apis.CreditBureauConfigurationApi
import org.openapitools.client.apis.CurrencyApi
import org.openapitools.client.apis.DataTablesApi
import org.openapitools.client.apis.DefaultApi
import org.openapitools.client.apis.DelinquencyRangeAndBucketsManagementApi
import org.openapitools.client.apis.DepositAccountOnHoldFundTransactionsApi
import org.openapitools.client.apis.DeviceRegistrationApi
import org.openapitools.client.apis.DocumentsApi
import org.openapitools.client.apis.EntityDataTableApi
import org.openapitools.client.apis.EntityFieldConfigurationApi
import org.openapitools.client.apis.ExternalAssetOwnersApi
import org.openapitools.client.apis.ExternalEventConfigurationApi
import org.openapitools.client.apis.ExternalServicesApi
import org.openapitools.client.apis.FetchAuthenticatedUserDetailsApi
import org.openapitools.client.apis.FineractEntityApi
import org.openapitools.client.apis.FixedDepositAccountApi
import org.openapitools.client.apis.FixedDepositAccountTransactionsApi
import org.openapitools.client.apis.FixedDepositProductApi
import org.openapitools.client.apis.FloatingRatesApi
import org.openapitools.client.apis.FundsApi
import org.openapitools.client.apis.GeneralLedgerAccountApi
import org.openapitools.client.apis.GlobalConfigurationApi
import org.openapitools.client.apis.GroupsApi
import org.openapitools.client.apis.GroupsLevelApi
import org.openapitools.client.apis.GuarantorsApi
import org.openapitools.client.apis.HolidaysApi
import org.openapitools.client.apis.HooksApi
import org.openapitools.client.apis.InlineJobApi
import org.openapitools.client.apis.InstanceModeApi
import org.openapitools.client.apis.InterOperationApi
import org.openapitools.client.apis.InterestRateChartApi
import org.openapitools.client.apis.InterestRateSlabAKAInterestBandsApi
import org.openapitools.client.apis.JournalEntriesApi
import org.openapitools.client.apis.LikelihoodApi
import org.openapitools.client.apis.ListReportMailingJobHistoryApi
import org.openapitools.client.apis.LoanAccountLockApi
import org.openapitools.client.apis.LoanCOBCatchUpApi
import org.openapitools.client.apis.LoanChargesApi
import org.openapitools.client.apis.LoanCollateralApi
import org.openapitools.client.apis.LoanCollateralManagementApi
import org.openapitools.client.apis.LoanDisbursementDetailsApi
import org.openapitools.client.apis.LoanProductsApi
import org.openapitools.client.apis.LoanReschedulingApi
import org.openapitools.client.apis.LoanTransactionsApi
import org.openapitools.client.apis.LoansApi
import org.openapitools.client.apis.MakerCheckerOr4EyeFunctionalityApi
import org.openapitools.client.apis.MappingFinancialActivitiesToAccountsApi
import org.openapitools.client.apis.MeetingsApi
import org.openapitools.client.apis.MixMappingApi
import org.openapitools.client.apis.MixReportApi
import org.openapitools.client.apis.MixTaxonomyApi
import org.openapitools.client.apis.NotesApi
import org.openapitools.client.apis.NotificationApi
import org.openapitools.client.apis.OfficesApi
import org.openapitools.client.apis.PasswordPreferencesApi
import org.openapitools.client.apis.PaymentTypeApi
import org.openapitools.client.apis.PeriodicAccrualAccountingApi
import org.openapitools.client.apis.PermissionsApi
import org.openapitools.client.apis.PocketApi
import org.openapitools.client.apis.PovertyLineApi
import org.openapitools.client.apis.ProductMixApi
import org.openapitools.client.apis.ProductsApi
import org.openapitools.client.apis.ProvisioningCategoryApi
import org.openapitools.client.apis.ProvisioningCriteriaApi
import org.openapitools.client.apis.ProvisioningEntriesApi
import org.openapitools.client.apis.RateApi
import org.openapitools.client.apis.RecurringDepositAccountApi
import org.openapitools.client.apis.RecurringDepositAccountTransactionsApi
import org.openapitools.client.apis.RecurringDepositProductApi
import org.openapitools.client.apis.RepaymentWithPostDatedChecksApi
import org.openapitools.client.apis.ReportMailingJobsApi
import org.openapitools.client.apis.ReportsApi
import org.openapitools.client.apis.RescheduleLoansApi
import org.openapitools.client.apis.RolesApi
import org.openapitools.client.apis.RunReportsApi
import org.openapitools.client.apis.SCHEDULERJOBApi
import org.openapitools.client.apis.SMSApi
import org.openapitools.client.apis.SPMAPILookUpTableApi
import org.openapitools.client.apis.SavingsAccountApi
import org.openapitools.client.apis.SavingsAccountTransactionsApi
import org.openapitools.client.apis.SavingsChargesApi
import org.openapitools.client.apis.SavingsProductApi
import org.openapitools.client.apis.SchedulerApi
import org.openapitools.client.apis.ScoreCardApi
import org.openapitools.client.apis.SearchAPIApi
import org.openapitools.client.apis.SelfAccountTransferApi
import org.openapitools.client.apis.SelfAuthenticationApi
import org.openapitools.client.apis.SelfClientApi
import org.openapitools.client.apis.SelfDividendApi
import org.openapitools.client.apis.SelfLoanProductsApi
import org.openapitools.client.apis.SelfLoansApi
import org.openapitools.client.apis.SelfRunReportApi
import org.openapitools.client.apis.SelfSavingsAccountApi
import org.openapitools.client.apis.SelfSavingsProductsApi
import org.openapitools.client.apis.SelfScoreCardApi
import org.openapitools.client.apis.SelfServiceRegistrationApi
import org.openapitools.client.apis.SelfShareAccountsApi
import org.openapitools.client.apis.SelfSpmApi
import org.openapitools.client.apis.SelfThirdPartyTransferApi
import org.openapitools.client.apis.SelfUserApi
import org.openapitools.client.apis.SelfUserDetailsApi
import org.openapitools.client.apis.ShareAccountApi
import org.openapitools.client.apis.SpmSurveysApi
import org.openapitools.client.apis.StaffApi
import org.openapitools.client.apis.StandingInstructionsApi
import org.openapitools.client.apis.StandingInstructionsHistoryApi
import org.openapitools.client.apis.SurveyApi
import org.openapitools.client.apis.TaxComponentsApi
import org.openapitools.client.apis.TaxGroupApi
import org.openapitools.client.apis.TellerCashManagementApi
import org.openapitools.client.apis.TwoFactorApi
import org.openapitools.client.apis.UserGeneratedDocumentsApi
import org.openapitools.client.apis.UsersApi
import org.openapitools.client.apis.WorkingDaysApi
import retrofit2.Retrofit
import java.security.KeyManagementException
import java.security.NoSuchAlgorithmException
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

/**
 * Fineract Client Kotlin SDK API entry point. Use this instead of the {@link ApiClient}.
 *
 * @author Aditya Gupta
 */

class FineractClient private constructor(
    private val httpClient: HttpClient,
    private val ktorfit: Ktorfit
) {
    val accountingClosures = ktorfit.create<AccountingClosureApi>()
    val accountingRules = ktorfit.create<AccountingRulesApi>()
    val accountNumberFormats = ktorfit.create<AccountNumberFormatApi>()
    val accountTransfers = ktorfit.create<AccountTransfersApi>()
    val adhocQuery = ktorfit.create<AdhocQueryApiApi>()
    val audits = ktorfit.create<AuditsApi>()
    val authentication = ktorfit.create<AuthenticationHTTPBasicApi>()
    val batches = ktorfit.create<BatchAPIApi>()
    val bulkImport = ktorfit.create<BulkImportApi>()
    val bulkLoans = ktorfit.create<BulkLoansApi>()
    val businessDateManagement = ktorfit.create<BusinessDateManagementApi>()
    val businessStepConfiguration = ktorfit.create<BusinessStepConfigurationApi>()
    val caches = ktorfit.create<CacheApi>()
    val calender = ktorfit.create<CalendarApi>()
    val cashiersJournal = ktorfit.create<CashierJournalsApi>()
    val cashiers = ktorfit.create<CashiersApi>()
    val centers = ktorfit.create<CentersApi>()
    val charges = ktorfit.create<ChargesApi>()
    val clients = ktorfit.create<ClientApi>()
    val clientCharges = ktorfit.create<ClientChargesApi>()
    val clientCollateralManagement = ktorfit.create<ClientCollateralManagementApi>()
    val clientFamilyMember = ktorfit.create<ClientFamilyMemberApi>()
    val clientIdentifiers = ktorfit.create<ClientIdentifierApi>()
    val clientAddresses = ktorfit.create<ClientsAddressApi>()
    val clientSearch = ktorfit.create<ClientSearchV2Api>()
    val clientTransactions = ktorfit.create<ClientTransactionApi>()
    val codes = ktorfit.create<CodesApi>()
    val codeValues = ktorfit.create<CodeValuesApi>()
    val collateralManagement = ktorfit.create<CollateralManagementApi>()
    val collectionSheet = ktorfit.create<CollectionSheetApi>()
    val creditBureauConfiguration = ktorfit.create<CreditBureauConfigurationApi>()
    val currencies = ktorfit.create<CurrencyApi>()
    val dataTables = ktorfit.create<DataTablesApi>()
    val legacy = ktorfit.create<DefaultApi>() // TODO FINERACT-1222
    val delinquencyRangeAndBucketsManagement =
        ktorfit.create<DelinquencyRangeAndBucketsManagementApi>()
    val depositAccountOnHoldFundTransactions =
        ktorfit.create<DepositAccountOnHoldFundTransactionsApi>()
    val deviceRegistrationApi = ktorfit.create<DeviceRegistrationApi>()
    val documents = ktorfit.create<DocumentsApi>()
    val entityDatatableChecks = ktorfit.create<EntityDataTableApi>()
    val entityFieldConfigurations = ktorfit.create<EntityFieldConfigurationApi>()
    val externalAssetOwners = ktorfit.create<ExternalAssetOwnersApi>()
    val externalEventConfiguration = ktorfit.create<ExternalEventConfigurationApi>()
    val externalServices = ktorfit.create<ExternalServicesApi>()
    val userDetails = ktorfit.create<FetchAuthenticatedUserDetailsApi>()
    val fineractEntity = ktorfit.create<FineractEntityApi>()
    val fixedDepositAccounts = ktorfit.create<FixedDepositAccountApi>()
    val fixedDepositAccountTransactions = ktorfit.create<FixedDepositAccountTransactionsApi>()
    val fixedDepositProducts = ktorfit.create<FixedDepositProductApi>()
    val floatingRates = ktorfit.create<FloatingRatesApi>()
    val funds = ktorfit.create<FundsApi>()
    val glAccounts = ktorfit.create<GeneralLedgerAccountApi>()
    val globalConfigurations = ktorfit.create<GlobalConfigurationApi>()
    val groups = ktorfit.create<GroupsApi>()
    val groupsLoans = ktorfit.create<GroupsLevelApi>()
    val guarantors = ktorfit.create<GuarantorsApi>()
    val holidays = ktorfit.create<HolidaysApi>()
    val hooks = ktorfit.create<HooksApi>()
    val inlineJob = ktorfit.create<InlineJobApi>()
    val instanceMode = ktorfit.create<InstanceModeApi>()
    val interestRateCharts = ktorfit.create<InterestRateChartApi>()
    val interestRateChartLabs = ktorfit.create<InterestRateSlabAKAInterestBandsApi>()
    val interOperation = ktorfit.create<InterOperationApi>()
    val journalEntries = ktorfit.create<JournalEntriesApi>()
    val likelihood = ktorfit.create<LikelihoodApi>()
    val reportMailings = ktorfit.create<ListReportMailingJobHistoryApi>()
    val loanAccountLock = ktorfit.create<LoanAccountLockApi>()
    val loanCharges = ktorfit.create<LoanChargesApi>()
    val loanCOBCatchUp = ktorfit.create<LoanCOBCatchUpApi>()
    val loanCollaterals = ktorfit.create<LoanCollateralApi>()
    val loanCollateralManagement = ktorfit.create<LoanCollateralManagementApi>()
    val loanDisbursementDetails = ktorfit.create<LoanDisbursementDetailsApi>()
    val loanProducts = ktorfit.create<LoanProductsApi>()
    val loanSchedules = ktorfit.create<LoanReschedulingApi>()
    val loans = ktorfit.create<LoansApi>()
    val loanTransactions = ktorfit.create<LoanTransactionsApi>()
    val makerCheckers = ktorfit.create<MakerCheckerOr4EyeFunctionalityApi>()
    val financialActivityAccountMappings = ktorfit.create<MappingFinancialActivitiesToAccountsApi>()
    val meetings = ktorfit.create<MeetingsApi>()
    val mixMappings = ktorfit.create<MixMappingApi>()
    val mixReports = ktorfit.create<MixReportApi>()
    val mixTaxonomies = ktorfit.create<MixTaxonomyApi>()
    val notes = ktorfit.create<NotesApi>()
    val notifications = ktorfit.create<NotificationApi>()
    val offices = ktorfit.create<OfficesApi>()
    val passwordPreferences = ktorfit.create<PasswordPreferencesApi>()
    val paymentTypes = ktorfit.create<PaymentTypeApi>()
    val periodicAccrualAccounting = ktorfit.create<PeriodicAccrualAccountingApi>()
    val permissions = ktorfit.create<PermissionsApi>()
    val selfPockets = ktorfit.create<PocketApi>()
    val povertyLine = ktorfit.create<PovertyLineApi>()
    val productMix = ktorfit.create<ProductMixApi>()
    val provisioningCategories = ktorfit.create<ProvisioningCategoryApi>()
    val products = ktorfit.create<ProductsApi>()
    val provisioningCriterias = ktorfit.create<ProvisioningCriteriaApi>()
    val provisioningEntries = ktorfit.create<ProvisioningEntriesApi>()
    val rate = ktorfit.create<RateApi>()
    val recurringDepositAccounts = ktorfit.create<RecurringDepositAccountApi>()
    val recurringDepositAccountTransactions =
        ktorfit.create<RecurringDepositAccountTransactionsApi>()
    val recurringDepositProducts = ktorfit.create<RecurringDepositProductApi>()
    val repaymentWithPostDatedChecks = ktorfit.create<RepaymentWithPostDatedChecksApi>()
    val reportMailingJobs = ktorfit.create<ReportMailingJobsApi>()
    val reports = ktorfit.create<ReportsApi>()
    val rescheduling = ktorfit.create<RescheduleLoansApi>()
    val roles = ktorfit.create<RolesApi>()
    val reportsRun = ktorfit.create<RunReportsApi>()
    val savingsAccounts = ktorfit.create<SavingsAccountApi>()
    val savingsTransactions = ktorfit.create<SavingsAccountTransactionsApi>()
    val savingsAccountCharges = ktorfit.create<SavingsChargesApi>()
    val savingsProducts = ktorfit.create<SavingsProductApi>()
    val jobsScheduler = ktorfit.create<SchedulerApi>()
    val jobs = ktorfit.create<SCHEDULERJOBApi>()
    val surveyScorecards = ktorfit.create<ScoreCardApi>()
    val search = ktorfit.create<SearchAPIApi>()
    val selfAccountTransfers = ktorfit.create<SelfAccountTransferApi>()
    val selfAuthentication = ktorfit.create<SelfAuthenticationApi>()
    val selfClients = ktorfit.create<SelfClientApi>()
    val selfDividend = ktorfit.create<SelfDividendApi>()
    val selfLoanProducts = ktorfit.create<SelfLoanProductsApi>()
    val selfLoans = ktorfit.create<SelfLoansApi>()
    val selfReportsRun = ktorfit.create<SelfRunReportApi>()
    val selfSavingsAccounts = ktorfit.create<SelfSavingsAccountApi>()
    val selfSavingsProducts = ktorfit.create<SelfSavingsProductsApi>()
    val selfSurveyScorecards = ktorfit.create<SelfScoreCardApi>()
    val selfRegistration = ktorfit.create<SelfServiceRegistrationApi>()
    val selfShareAccounts = ktorfit.create<SelfShareAccountsApi>()
    val selfSurveys = ktorfit.create<SelfSpmApi>()
    val selfThirdPartyBeneficiaries = ktorfit.create<SelfThirdPartyTransferApi>()
    val selfUser = ktorfit.create<SelfUserApi>()
    val selfUserDetails = ktorfit.create<SelfUserDetailsApi>()
    val shareAccounts = ktorfit.create<ShareAccountApi>()
    val sms = ktorfit.create<SMSApi>()
    val surveyLookupTables = ktorfit.create<SPMAPILookUpTableApi>()
    val spmSurveys = ktorfit.create<SpmSurveysApi>()
    val staff = ktorfit.create<StaffApi>()
    val standingInstructions = ktorfit.create<StandingInstructionsApi>()
    val standingInstructionsHistory = ktorfit.create<StandingInstructionsHistoryApi>()
    val surveys = ktorfit.create<SurveyApi>()
    val taxComponents = ktorfit.create<TaxComponentsApi>()
    val taxGroups = ktorfit.create<TaxGroupApi>()
    val tellers = ktorfit.create<TellerCashManagementApi>()
    val twoFactor = ktorfit.create<TwoFactorApi>()
    val templates = ktorfit.create<UserGeneratedDocumentsApi>()
    val users = ktorfit.create<UsersApi>()
    val workingDays = ktorfit.create<WorkingDaysApi>()

    fun httpClient(): HttpClient {
        return this.httpClient
    }

    fun baseURL(): String {
        return ktorfit.baseUrl
    }

    /**
     * Create an implementation of the API endpoints defined by the `service` interface, using
     * [Retrofit.create]. This method is typically not required to be invoked for standard API usage, but
     * can be a handy back door for non-trivial advanced customizations of the API client if you have extended Fineract
     * with your own REST APIs.
     */
//    fun <S> createService(serviceClass: Class<S>?): S {
//        return ktorfit.create(serviceClass)
//    }

    class Builder internal constructor() {
//        private val json: JSON = JSON()

        /**
         * Obtain the internal OkHttp Builder. This method is typically not required to be invoked for simple API
         * usages, but can be a handy back door for non-trivial advanced customizations of the API client.
         *
         * @return the [ApiClient] which [.build] will use.
         */
//        private val json = Json

//        val okBuilder: OkHttpClient.Builder = OkHttpClient.Builder()

        /**
         * Obtain the internal Retrofit Builder. This method is typically not required to be invoked for simple API
         * usages, but can be a handy back door for non-trivial advanced customizations of the API client.
         *
         * @return the [ApiClient] which [.build] will use.
         */
//        val retrofitBuilder: Retrofit.Builder =
//            Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create())
//                .addConverterFactory(JSON.GsonCustomConverterFactory.create(json.gson))

        private lateinit var baseURL: String
        private var tenant: String? = null
        private var loginUsername: String? = null
        private var loginPassword: String? = null
        private var insecure: Boolean = false

        fun baseURL(baseURL: String): Builder {
            this.baseURL = baseURL
            return this
        }

        fun tenant(tenant: String?): Builder {
            this.tenant = tenant
            return this
        }

        fun basicAuth(username: String?, password: String?): Builder {
            this.loginUsername = username
            this.loginPassword = password
            return this
        }

        fun inSecure(insecure: Boolean): Builder {
            this.insecure = insecure
            return this
        }

//        fun logging(level: Level?): Builder {
//            val logging = HttpLoggingInterceptor()
//            level?.let { logging.setLevel(it) }
//            okBuilder.addInterceptor(logging)
//            return this
//        }

        /**
         * Skip Fineract API host SSL certificate verification. DO NOT USE THIS when invoking a production server's API!
         * This is intended for https://localhost:8443/ testing of development servers with self-signed certificates,
         * only. If you do not understand what this is, do not use it. You WILL cause a security issue in your
         * application due to the possibility of a "man in the middle" attack when this is enabled.
         */
//        @Suppress("unused")
//        fun insecure(insecure: Boolean): Builder {
//            // Nota bene: Similar code to this is also in Fineract Provider's
//            // org.apache.fineract.infrastructure.hooks.processor.ProcessorHelper
//            if (insecure) {
//                val insecureHostnameVerifier =
//                    HostnameVerifier { hostname: String?, session: SSLSession? -> true }
//                okBuilder.hostnameVerifier(insecureHostnameVerifier)
//
//                try {
//                    val insecureX509TrustManager: X509TrustManager = object : X509TrustManager {
//                        @Throws(CertificateException::class)
//                        override fun checkClientTrusted(
//                            chain: Array<X509Certificate>,
//                            authType: String
//                        ) {
//                        }
//
//                        @Throws(CertificateException::class)
//                        override fun checkServerTrusted(
//                            chain: Array<X509Certificate>,
//                            authType: String
//                        ) {
//                        }
//
//                        override fun getAcceptedIssuers(): Array<X509Certificate> {
//                            return arrayOf()
//                        }
//                    }
//
//                    // TODO "SSL" or "TLS" as in hooks.processor.ProcessorHelper?
//                    val sslContext = SSLContext.getInstance("SSL")
//                    sslContext.init(
//                        null,
//                        arrayOf<TrustManager>(insecureX509TrustManager),
//                        SecureRandom()
//                    )
//                    val insecureSslSocketFactory = sslContext.socketFactory
//
//                    okBuilder.sslSocketFactory(insecureSslSocketFactory, insecureX509TrustManager)
//                } catch (e: NoSuchAlgorithmException) {
//                    throw IllegalStateException("insecure() SSL configuration failed", e)
//                } catch (e: KeyManagementException) {
//                    throw IllegalStateException("insecure() SSL configuration failed", e)
//                }
//            }
//            return this
//        }

        fun build(): FineractClient {

            val ktorClient = HttpClient(CIO) {
                install(ContentNegotiation) {
                    json(Json {
                        isLenient = true
                        ignoreUnknownKeys = true
                    })
                }
                install(Logging) {
                    logger = Logger.DEFAULT
                    level = LogLevel.INFO
                }
                install(Auth) {
                    basic {
                        credentials {
                            BasicAuthCredentials(
                                username = loginUsername.toString(),
                                password = loginPassword.toString()
                            )
                        }
                    }
                }

                defaultRequest {
                    headers {
                        append("Content-Type", "application/json")
                        append("Accept", "application/json")
                        tenant?.let {
                            append("fineract-platform-tenantid", it)
                        }
                    }
                }

                if (insecure) {
                    engine {
                        https {
                            val insecureTrustManager = object : X509TrustManager {
                                override fun checkClientTrusted(
                                    chain: Array<X509Certificate>,
                                    authType: String
                                ) {
                                }

                                override fun checkServerTrusted(
                                    chain: Array<X509Certificate>,
                                    authType: String
                                ) {
                                }

                                override fun getAcceptedIssuers(): Array<X509Certificate> =
                                    arrayOf()
                            }

                            try {
                                val sslContext = SSLContext.getInstance("SSL").apply {
                                    init(
                                        null,
                                        arrayOf<TrustManager>(insecureTrustManager),
                                        SecureRandom()
                                    )
                                }
                                trustManager = insecureTrustManager
                            } catch (e: NoSuchAlgorithmException) {
                                throw IllegalStateException("SSL configuration failed", e)
                            } catch (e: KeyManagementException) {
                                throw IllegalStateException("SSL configuration failed", e)
                            }
                        }
                    }
                }
            }

            val ktorfitBuilder = Ktorfit.Builder()
                .httpClient(ktorClient)
                .baseUrl(baseURL)
                .build()


//            // URL
//            has<String?>("baseURL", baseURL)?.let { retrofitBuilder.baseUrl(it) }
//
//            // Tenant
//            val tenantAuth: ApiKeyAuth =
//                ApiKeyAuth("header", "fineract-platform-tenantid", tenant.toString())
//            okBuilder.addInterceptor(tenantAuth)
//
//            // BASIC Auth
//            val basicAuth: HttpBasicAuth = HttpBasicAuth()
//            basicAuth.setCredentials(has("username", username), has("password", password))
//            okBuilder.addInterceptor(basicAuth)
//
//            val okHttpClient: OkHttpClient = okBuilder.build()
//            retrofitBuilder.client(okHttpClient)

            return FineractClient(ktorClient, ktorfitBuilder)
        }

        @Throws(IllegalStateException::class)
        private fun <T> has(propertyName: String, value: T?): T {
            checkNotNull(value) { "Must call $propertyName(...) to create valid Builder" }
            return value
        }
    }

    companion object {
        /**
         * Constant to be used in requests where Fineract's API requires a dateFormat to be given. This matches the format
         * in which LocalDate instances are serialized. (BTW: In a Java client API, it seems weird to have strong LocalDate
         * (not String) instances, and then have to specify its format, see
         * https://issues.apache.org/jira/browse/FINERACT-1233.)
         */
        // Matching org.apache.fineract.client.util.JSON.LocalDateTypeAdapter.formatter
        const val DATE_FORMAT: String = "yyyy-MM-dd"

        fun builder(): Builder {
            return Builder()
        }
    }
}