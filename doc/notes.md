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