private fun printKeyHash(){
        try{
            val info :PackageInfo = packageManager.getPackageInfo("com.pratt.superlist", PackageManager.GET_SIGNATURES)
            for(signature in info.signatures){
                val md:MessageDigest = MessageDigest.getInstance("SHA")
                md.update(signature.toByteArray())
                Log.e("KEYHAS!!!", Base64.encodeToString(md.digest(),Base64.DEFAULT))
            }
        }
        catch(e:PackageManager.NameNotFoundException){

        }
        catch (e:NoSuchAlgorithmException){

        }
    }
