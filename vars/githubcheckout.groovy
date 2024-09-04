def call(Map config) {
// checkout scmGit(branches: [[name: config.branch]], extensions: [], userRemoteConfigs: [[config.url]])
   checkout scmGit(branches: [[name: "config.url"]], extensions: [], userRemoteConfigs: [[url: "config.url"]])
}
