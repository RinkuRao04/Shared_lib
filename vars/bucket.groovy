def call (Map config){
    withAWS(credentials: "${config.aws_cred}" , region: "${config.region}") {
        sh """ aws s3 sync ${config.buildPath}/ s3://${config.bucket}/ --region ${config.region} --metadata Content-Type=text/html """
    }
}
