package contracts.fraud

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'POST'
        url '/surrenders'
        body '''{ "productId": "A0572", "faceAmount": "100000000.0" }'''
        headers {
            contentType('application/json')
        }
    }
    response {
        status OK()
        body '''{ "surrenders" : "90000000.0" }'''
        headers {
            contentType('application/json')
        }
    }
}