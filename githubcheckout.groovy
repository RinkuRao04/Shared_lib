def call(Map config) {
   checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/sanjana-purbia/app']])
}
