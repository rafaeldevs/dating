#!/bin/bash

# I had to bb

tp=test-report.txt
ts=test-signature.txt

bb test > $tp

sha256sum $tp > $ts
