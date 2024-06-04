package contracts.fraud

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'PUT'
        url '/fraudcheck'
        body '''{ "clientId": "1", "loanAmount": "99999" }'''
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body '''{ "fraudCheckStatus" : "FRAUD", "reason": "Amount too high" }'''
        headers {
            contentType('application/json')
        }
    }
}