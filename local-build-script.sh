#!/bin/bash

gradle clean build
docker build -t simple-service:latest .
