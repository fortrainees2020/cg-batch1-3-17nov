# spring-security-jwt-example
Reference : https://jwt.io/
Fillter will authentication request 
if pass - dispaly output
else unauthorized error
1. Username & password passed to DelegateFilterProxy which converts it in Authentication Object
2. Filter does not have logic authenticate this request
3. Filter will forward the request to Authentication manager.
4. Authenticate Manager Takes the authenticate object as argument and will call authenticate ().
5. Authentication Manager pass on request to Authentication Provider (Username/Password/JWT Token/ LDAP
6. Appropriate Authntication Manager returns the result.
7. To load the user details from extra db resource it takes help of UserDetailsService
8. Based on username, it will load s the user details and return back to provider
9. then return to Filter and send the request to SecurityCOntext.getContetn.setAuthentication(authentication)
