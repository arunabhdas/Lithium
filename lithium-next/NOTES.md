# Lithium 
CRM written using Next 13 


# Steps

## Install prerequisites


```
==> node -v || node --version

// list locally installed versions of node
==> nvm ls

// list remove available versions of node
==> nvm ls-remote


==> nvm install 18.19.1
Downloading and installing node v18.19.1...
Downloading https://nodejs.org/dist/v18.19.1/node-v18.19.1-darwin-arm64.tar.xz...
####################################################################################################################### 100.0%
Computing checksum with shasum -a 256
Checksums matched!
Now using node v18.19.1 (npm v10.2.4)
==> ls -lrt
total 672
-rw-r--r--@   1 coder  staff    1383 Mar  4 13:19 README.md
-rw-r--r--@   1 coder  staff      92 Mar  4 13:19 next.config.mjs
-rw-r--r--@   1 coder  staff     201 Mar  4 13:19 next-env.d.ts
-rw-r--r--@   1 coder  staff      83 Mar  4 13:19 postcss.config.js
drwxr-xr-x@   4 coder  staff     128 Mar  4 13:19 public
-rw-r--r--@   1 coder  staff     578 Mar  4 13:19 tsconfig.json
drwxr-xr-x@   3 coder  staff      96 Mar  4 13:19 src
-rw-r--r--@   1 coder  staff     510 Mar  4 13:19 tailwind.config.ts
-rw-r--r--@   1 coder  staff     547 Mar  4 13:19 package.json
-rw-r--r--@   1 coder  staff  312187 Mar  4 13:20 package-lock.json
drwxr-xr-x@ 322 coder  staff   10304 Mar  4 13:20 node_modules

==> nvm use 18.19.1

==> node --version
v18.19.1
==> nvm alias default 18.19.1
default -> 18.19.1 (-> v18.19.1)
```

## Scaffold the project

```bash

npx create-next-app@latest lithium-web-app --typescript --tailwind --eslint



Need to install the following packages:
  create-next-app@14.1.1
Ok to proceed? (y) 
npm WARN EBADENGINE Unsupported engine {
npm WARN EBADENGINE   package: 'create-next-app@14.1.1',
npm WARN EBADENGINE   required: { node: '>=18.17.0' },
npm WARN EBADENGINE   current: { node: 'v16.20.0', npm: '8.19.4' }
npm WARN EBADENGINE }
✔ Would you like to use `src/` directory? … No / Yes (YES)
✔ Would you like to use App Router? (recommended) … No / Yes (YES)
✔ Would you like to customize the default import alias (@/*)? … No / Yes (YES)
✔ What import alias would you like configured? … @/* (ENTER)

```

## Create v0 components.json

```
npx v0@latest init
```

## Add the dashboard component

```
npx v0 add 4OBuv9aiFVL
```

## Develop

```
cd lithium-next && cd lithium-web-app

npm run dev
```