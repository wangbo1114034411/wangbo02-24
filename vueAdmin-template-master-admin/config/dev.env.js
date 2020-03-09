'use strict'
const merge = require('webpack-merge')
const prodEnv = require('./prod.env')

module.exports = merge(prodEnv, {
  NODE_ENV: '"development"',
  BASE_API: '" http://192.168.217.10:7300/mock/5e620dc72cbdcb2a45808e75"',
})
