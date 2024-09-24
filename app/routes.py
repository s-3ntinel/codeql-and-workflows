import os.path
from flask import Flask, request, abort, Response
from app import app

bearer = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"
google_api_key = "AIzaSyAw-SpLHVTIP3IFEIkckCuEmIhnUrY9OrQ"

@app.route("/user_picture1")
def user_picture1():
    base_path = 'server/static/images'
    filename = request.args.get('p')
    # GOOD: Verify with normalized version of path
    fullpath = os.path.normpath(os.path.join(base_path, filename))
    if not fullpath.startswith(base_path):
        raise Exception("not allowed")
    data = open(fullpath, 'rb').read()

    return data

@app.route("/user_picture2")
def user_picture2():
    base_path = 'server/static/images'
    filename = request.args.get('p')
    # GOOD: Verify with normalized version of path
    fullpath = os.path.normpath(os.path.join(base_path, filename))
    if not fullpath.startswith(base_path):
        raise Exception("not allowed")
    data = open(fullpath, 'rb').read()
    return data

@app.route("/user_picture3")
def user_picture3():
    base_path = 'server/static/images'
    filename = request.args.get('p')
    #GOOD -- Verify with normalised version of path
    fullpath = os.path.normpath(os.path.join(base_path, filename))
    if not fullpath.startswith(base_path):
        raise Exception("not allowed")
    data = open(fullpath, 'rb').read()
    return data
