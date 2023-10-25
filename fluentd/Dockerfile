# fluentd/Dockerfile
FROM fluent/fluentd:v1.12.0-debian-1.0
# Install elasticsearch library and fluent plugin.

# Pin the elasticsearch-ruby library < 7.14.
# See https://github.com/uken/fluent-plugin-elasticsearch/issues/912
USER root

RUN gem install elasticsearch -v 7.13.3 &&  gem install fluent-plugin-elasticsearch -v 5.2.3 && gem install fluent-plugin-http-healthcheck
USER fluent