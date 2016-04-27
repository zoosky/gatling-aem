# Notes

# AEM 6.1 Notes

## AEM uses Symantec for brand protection:
            
            val uri1 = "http://sr.symcd.com"
        	
            .exec(http("request_1")
			.get(uri1 + "/MFYwVKADAgEAME0wSzBJMAkGBSsOAwIaBQAEFHQkFGcGn%2FXgmD9ePhproGUqVBV1BBQBWavn3ToLWaZkY9bPIAdX1ZHnagIQW%2FIjqCeNKYjw6kdaRFom%2Bw%3D%3D")
			.headers(headers_1)
			.resources(http("request_2")
			.get(uri1 + "/MFYwVKADAgEAME0wSzBJMAkGBSsOAwIaBQAEFHQkFGcGn%2FXgmD9ePhproGUqVBV1BBQBWavn3ToLWaZkY9bPIAdX1ZHnagIQVFxOd0TKq74nCbq5zCoTZQ%3D%3D")
			.headers(headers_1),
            http("request_3")
			.get(uri1 + "/MFYwVKADAgEAME0wSzBJMAkGBSsOAwIaBQAEFHQkFGcGn%2FXgmD9ePhproGUqVBV1BBQBWavn3ToLWaZkY9bPIAdX1ZHnagIQWLtyjugCY38AlD1h%2FQdzsQ%3D%3D")
			.headers(headers_1)))
		    .pause(15)
        
## Set native Transport = true on Linux

See catling.conf:

        useNativeTransport = true           
        
### AEM Cookies

See [Stateless authentication Token](https://docs.adobe.com/docs/en/aem/6-1/administer/security/encapsulated-token.html).

* `JSESSIONID`
* `login-token`
* `cq-authoring-mode`

With 5 users logging in as admin, there are 5 different login-tokens:

		Session(LoginSimulation,5,Map(gatling.http.cache.dns -> io.netty.resolver.DefaultNameResolver@495c0db3, gatling.http.cookies -> CookieJar(Map(CookieKey(login-token,localhost,/) -> StoredCookie(login-token=e9bc98fc-735f-4ba4-84b2-956a62a153cf%3a85e9999a-92cf-4b8f-8276-c55a38e1d860_b1f250442e5ae5f6%3acrx.default; path=/; HTTPOnly,true,false,1461317882541), CookieKey(cq-authoring-mode,localhost,/) -> StoredCookie(cq-authoring-mode=TOUCH; path=/,true,false,1461317883447))), gatling.http.referer -> http://localhost:4502/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown, gatling.http.cache.contentCache -> io.gatling.core.util.cache.Cache@2f47de60),1461317877271,14,OK,List(),io.gatling.core.protocol.ProtocolComponentsRegistry$$Lambda$157/800596102@76f36f69)
		
		Session(LoginSimulation,4,Map(gatling.http.cache.dns -> io.netty.resolver.DefaultNameResolver@495c0db3, gatling.http.cookies -> CookieJar(Map(CookieKey(login-token,localhost,/) -> StoredCookie(login-token=e9bc98fc-735f-4ba4-84b2-956a62a153cf%3a6ce25a5b-8aad-497c-a6fd-64266648a9f4_00ad405d946cfe4a%3acrx.default; path=/; HTTPOnly,true,false,1461317882647), CookieKey(cq-authoring-mode,localhost,/) -> StoredCookie(cq-authoring-mode=TOUCH; path=/,true,false,1461317883558))), gatling.http.referer -> http://localhost:4502/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown, gatling.http.cache.contentCache -> io.gatling.core.util.cache.Cache@368ec061),1461317877195,31,OK,List(),io.gatling.core.protocol.ProtocolComponentsRegistry$$Lambda$157/800596102@76f36f69)
		
		Session(LoginSimulation,1,Map(gatling.http.cache.dns -> io.netty.resolver.DefaultNameResolver@495c0db3, gatling.http.cookies -> CookieJar(Map(CookieKey(login-token,localhost,/) -> StoredCookie(login-token=e9bc98fc-735f-4ba4-84b2-956a62a153cf%3aa7670f38-ccc4-4004-99a4-53a3f0f6eb91_fb8bb8b7f514f58d%3acrx.default; path=/; HTTPOnly,true,false,1461317882852), CookieKey(cq-authoring-mode,localhost,/) -> StoredCookie(cq-authoring-mode=TOUCH; path=/,true,false,1461317883581))), gatling.http.referer -> http://localhost:4502/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown, gatling.http.cache.contentCache -> io.gatling.core.util.cache.Cache@68b92148),1461317877010,17,OK,List(),io.gatling.core.protocol.ProtocolComponentsRegistry$$Lambda$157/800596102@76f36f69)
		
		Session(LoginSimulation,3,Map(gatling.http.cache.dns -> io.netty.resolver.DefaultNameResolver@495c0db3, gatling.http.cookies -> CookieJar(Map(CookieKey(login-token,localhost,/) -> StoredCookie(login-token=e9bc98fc-735f-4ba4-84b2-956a62a153cf%3aaf7f1288-bc2d-41e7-a0b1-a61bbf777701_b51d04fa15ceb280%3acrx.default; path=/; HTTPOnly,true,false,1461317882800), CookieKey(cq-authoring-mode,localhost,/) -> StoredCookie(cq-authoring-mode=TOUCH; path=/,true,false,1461317883593))), gatling.http.referer -> http://localhost:4502/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown, gatling.http.cache.contentCache -> io.gatling.core.util.cache.Cache@5caa5c57),1461317877152,14,OK,List(),io.gatling.core.protocol.ProtocolComponentsRegistry$$Lambda$157/800596102@76f36f69)
		
		Session(LoginSimulation,2,Map(gatling.http.cache.dns -> io.netty.resolver.DefaultNameResolver@495c0db3, gatling.http.cookies -> CookieJar(Map(CookieKey(login-token,localhost,/) -> StoredCookie(login-token=e9bc98fc-735f-4ba4-84b2-956a62a153cf%3acfc05c71-4723-4f3b-bb7d-fd82707afcb3_198875c021157ab4%3acrx.default; path=/; HTTPOnly,true,false,1461317882770), CookieKey(cq-authoring-mode,localhost,/) -> StoredCookie(cq-authoring-mode=TOUCH; path=/,true,false,1461317883611))), gatling.http.referer -> http://localhost:4502/libs/granite/core/content/login.html?resource=%2F&$$login$$=%24%24login%24%24&j_reason=unknown&j_reason_code=unknown, gatling.http.cache.contentCache -> io.gatling.core.util.cache.Cache@4c5b629f),1461317877130,39,OK,List(),io.gatling.core.protocol.ProtocolComponentsRegistry$$Lambda$157/800596102@76f36f69)

The `login-token`s share a prefix

		e9bc98fc-735f-4ba4-84b2-956a62a153cf%3a
		
and a suffix
	
		%3acrx.default
		
Note that in the `Day CRX Token Authentication Handler` the setting `Enable encapsulated token support` is set to false.

	-	CSRF-Token -> CSRF-Token remove POST
	
	
   
 
Apache Jackrabbit Oak TokenConfiguration

Default author session timeout: 43200000 ms


# Gatling Notes

To reuse POST responeses, see [Check DSL](http://gatling.io/docs/2.2.0/http/http_check.html)